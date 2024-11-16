package com.example.termproject

import android.util.Log
import androidx.camera.core.CameraSelector
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.lifecycle.compose.LocalLifecycleOwner

@Composable
fun CameraPreviewView(

) {
    val context = LocalContext.current

    // LifecycleOwner를 Compose에서 가져옴
    val lifecycleOwner = LocalLifecycleOwner.current

    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { ctx ->
            PreviewView(ctx).apply {
                // CameraX 초기화
                val cameraProviderFuture = ProcessCameraProvider.getInstance(ctx)
                cameraProviderFuture.addListener({
                    val cameraProvider = cameraProviderFuture.get()

                    // 미리보기 설정
                    val preview = Preview.Builder()
                        .build()
                        .also {
                            it.setSurfaceProvider(this.surfaceProvider)
                        }

                    // 카메라 선택
                    val cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA

                    try {
                        cameraProvider.unbindAll()
                        cameraProvider.bindToLifecycle(
                            lifecycleOwner,
                            cameraSelector,
                            preview
                        )
                    } catch (exc: Exception) {
                        Log.e("CameraX", "Use case binding failed", exc)
                    }
                }, ContextCompat.getMainExecutor(ctx))
            }
        }
    )
}

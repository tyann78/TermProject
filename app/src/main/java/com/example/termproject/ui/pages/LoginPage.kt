package com.example.termproject.ui.pages

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPage(
    gotoRegisterPage: () -> Unit
){
    Scaffold(
            modifier = Modifier.fillMaxSize(),
    topBar = {
        TopAppBar(
            title = {
                Text(text = "Login")
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.AutoMirrored.Filled.ExitToApp, contentDescription = "")

                }
            }
        )
    }
    ) {innerpadding ->


    }
}
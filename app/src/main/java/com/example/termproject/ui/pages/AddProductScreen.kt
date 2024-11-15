package com.example.termproject.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun AddProductScreen(navController: NavController) {
    Column {
        Text("대충 물품 추가")
        Button(onClick = { navController.navigate("camera") }) {
            Text("Camera")
        }
        Button(onClick = { /* Add product action */ }) {
            Text("Add Product")
        }
    }
}

package com.example.termproject.ui.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.termproject.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainPageScreen(navController: NavController) {

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Main page")
                }
            )
        },
        bottomBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement =  Arrangement.SpaceEvenly
            ) {
                IconButton(onClick = { navController.navigate("calender") }) {
                    Icon(imageVector =  ImageVector.vectorResource(id = R.drawable.baseline_calendar_month_24), contentDescription = "")
                }
                IconButton(onClick = {  }) {
                    Icon(Icons.Default.Home, contentDescription = "")
                }
                IconButton(onClick = { navController.navigate("stats") }) {
                    Icon(Icons.Default.Info, contentDescription = "")
                }
            }
        }
    ) { innerpadding ->
        Column (
            modifier = Modifier
                .padding(innerpadding)
                .fillMaxWidth()
                .padding(16.dp)
        ){
            OutlinedCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ){
                Text(text = "대충 통계")
            }

            Button(onClick = { navController.navigate("addProduct") }) {
                Text("Add Product")
            }
        }
    }
}

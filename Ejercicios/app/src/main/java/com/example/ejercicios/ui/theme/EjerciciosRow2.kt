package com.example.ejercicios.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RowActivity2() {

    Row(modifier = Modifier
        .fillMaxWidth()
        .horizontalScroll(rememberScrollState())
    ) {
        for (i in 1..20) {
            Box(
                modifier = Modifier
                    .width(68.dp)
                    .height(68.dp)
                    .padding(8.dp)
                    .background(Color.Blue)
            ) {
                Text(
                    text = "Ejemplo1",
                    color = Color.White,
                    fontSize = 12.sp
                )
            }
            Box(
                modifier = Modifier
                    .width(68.dp)
                    .height(68.dp)
                    .padding(8.dp)
                    .background(Color.Red)
            ) {
                Text(
                    text = "Ejemplo1",
                    color = Color.White,
                    fontSize = 12.sp
                )
            }
            Box(
                modifier = Modifier
                    .width(68.dp)
                    .height(68.dp)
                    .padding(8.dp)
                    .background(Color.Yellow)
            ) {
                Text(
                    text = "Ejemplo1",
                    color = Color.Black,
                    fontSize = 12.sp
                )
            }
            Box(
                modifier = Modifier
                    .width(68.dp)
                    .height(68.dp)
                    .padding(8.dp)
                    .background(Color.Green)
            ) {
                Text(
                    text = "Ejemplo1",
                    color = Color.Black,
                    fontSize = 12.sp
                )
            }
            Box(
                modifier = Modifier
                    .width(68.dp)
                    .height(68.dp)
                    .padding(8.dp)
                    .background(Color.Magenta)
            ) {
                Text(
                    text = "Ejemplo1",
                    color = Color.Black,
                    fontSize = 12.sp
                )
            }
            Box(
                modifier = Modifier
                    .width(68.dp)
                    .height(68.dp)
                    .padding(8.dp)
                    .background(Color.Cyan)
            ) {
                Text(
                    text = "Ejemplo1",
                    color = Color.Black,
                    fontSize = 12.sp
                )
            }
        }
    }

}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun RowActivity2Preview() {
    RowActivity2()
}
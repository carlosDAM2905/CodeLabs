package com.example.ejercicios.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyColumn1(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(Color.Gray),
            contentAlignment = Alignment.Center,
        ) {
            Text("Ejemplo1")
        }

        Box(
            modifier = Modifier
                .width(220.dp)
                .height(80.dp)
                .background(Color.Black),
            contentAlignment = Alignment.CenterEnd
        ) {
            Text(
                text = "Ejemplo2",
                color = Color.White
            )
        }

        Box(modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .background(Color.Cyan),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(
                modifier = Modifier.padding(bottom = 12.dp),
                text = "Ejemplo3",
                color = Color.Blue,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace
            )
        }

        Box(modifier = Modifier
            .width(110.dp)
            .height(80.dp)
            .background(Color.Magenta),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Ejemplo4",
                color = Color.White,
            )
        }


    }
}

@Composable
fun MyColumn2(modifier: Modifier = Modifier) {

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(bottom = 44.dp)
        .verticalScroll(rememberScrollState())
        .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        for (i in 1..30) {

            Box(modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .padding(bottom = 4.dp)
                .background(Color.LightGray),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    modifier = Modifier,
                    text = "Ejemplo1",
                    fontSize = 24.sp
                )
            }
        }
    }

}

//===================PREVIEWS===================



@Preview(showBackground = true)
@Composable
fun MyColumn1Preview() {
    MyColumn1()
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyColumn2Preview() {
    MyColumn2()
}
package com.example.ejercicios.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RowActivity() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 28.dp, top = 28.dp, start = 8.dp, end = 8.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            for (i in 1..3)
            Box(
                modifier = Modifier
                    .width(68.dp)
                    .height(68.dp)
                    .background(Color.Blue),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Ejemplo1",
                    color = Color.White,
                    fontSize = 12.sp
                )

            }

        }

        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround


        ) {
            for (i in 1..3) {
                Box(
                    modifier = Modifier
                        .width(68.dp)
                        .height(68.dp)
                        .background(Color.Red),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Ejemplo1",
                        color = Color.White,
                        fontSize = 12.sp
                    )

                }
            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            for (i in 1..3) {
                Box(
                    modifier = Modifier
                        .width(68.dp)
                        .height(68.dp)
                        .background(Color.Yellow),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Ejemplo1",
                        color = Color.Black,
                        fontSize = 12.sp
                    )

                }
            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(24.dp, Alignment.End)
        ) {

            for (i in 1..3) {
                Box(
                    modifier = Modifier
                        .width(68.dp)
                        .height(68.dp)
                        .background(Color.Green),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Ejemplo1",
                        color = Color.Black,
                        fontSize = 12.sp
                    )

                }
            }

        }

        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(24.dp, Alignment.CenterHorizontally)

        ) {
            for (i in 1..3) {
                Box(
                    modifier = Modifier
                        .width(68.dp)
                        .height(68.dp)
                        .background(Color.Magenta),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Ejemplo1",
                        color = Color.Black,
                        fontSize = 12.sp
                    )

                }
            }


        }

        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(24.dp, Alignment.Start)

        ) {
            for (i in 1..3) {
                Box(
                    modifier = Modifier
                        .width(68.dp)
                        .height(68.dp)
                        .background(Color.Cyan),
                    contentAlignment = Alignment.Center
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

}

//========PREVIEWS========

@Preview(showBackground = true,)
@Composable
fun PreviewRowActivity() {
    RowActivity()
}
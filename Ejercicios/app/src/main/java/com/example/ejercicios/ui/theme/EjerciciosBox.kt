package com.example.ejercicios.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyBox1(name: String, modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 48.dp)
            .background(Color.Cyan),
        contentAlignment = Alignment.Center
    ) {

        Box(
            modifier = Modifier
                .background(Color.Blue)
                .padding(20.dp),
            contentAlignment = Alignment.Center

        ) {
            Text(
                text = "Esto es un ejemplo",
                modifier = modifier,
                color = Color.White
            )
        }


    }
}
//con contentAlignment
@Composable
fun MyBox2(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .size(400.dp)
            .background(Color.Green),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(300.dp)
                .background(color = Color.Red),
            contentAlignment = Alignment.Center,

            ) {
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .background(color = Color.Blue),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .background(Color.Yellow)
                        .size(100.dp),
                    contentAlignment = Alignment.Center

                ) {
                    Box(
                        modifier = Modifier
                            .background(Color.Black)
                            .size(50.dp),
                        contentAlignment = Alignment.Center

                    ) {}

                }
            }

        }
    }
}

//con align
@Composable
fun MyBox2align(modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .size(400.dp)
        .background(Color.Green),
        contentAlignment = Alignment.Center
    ){
        Box(modifier = Modifier
            .size(300.dp)
            .background(Color.Red)
            .align(Alignment.Center)
        ) {
            Box(modifier = Modifier
                .size(200.dp)
                .background(Color.Blue)
                .align(Alignment.Center)
            ) {
                Box(modifier = Modifier
                    .size(100.dp)
                    .background(Color.Yellow)
                    .align(Alignment.Center)
                ) {
                    Box(modifier = Modifier
                        .size(50.dp)
                        .background(Color.Black)
                        .align(Alignment.Center)
                    )
                }
            }
        }

    }
}

//con contentAlignment
@Composable
fun MyBox3(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .size(400.dp)
            .background(Color.Green),
        contentAlignment = Alignment.TopEnd

    ) {
        Box(
            modifier = Modifier
                .size(300.dp)
                .background(Color.Red),
            contentAlignment = Alignment.BottomStart
        ) {
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .background(Color.Blue),
                contentAlignment = Alignment.BottomEnd
            ) {
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.Yellow),
                    contentAlignment = Alignment.TopStart
                ) {
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .background(Color.Black)
                    )

                }

            }
        }

    }
}

//con align:
@Composable
fun MyBox3align(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .size(400.dp)
            .background(Color.Green),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(300.dp)
                .background(Color.Red)
                .align(Alignment.TopEnd)
        ) {
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .background(Color.Blue)
                    .align(Alignment.BottomStart)
            ) {
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.Yellow)
                        .align(Alignment.BottomEnd)
                ) {
                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .background(Color.Black)

                    )

                }

            }
        }

    }
}

//previews

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyBox1Preview() {
    EjerciciosTheme {
        MyBox1("Esto es un ejemplo")
    }
}

@Preview(showBackground = true, widthDp = 400, heightDp = 400)
@Composable
fun MyBox2PreviewContentAlignment() {
    EjerciciosTheme {
        MyBox2()
    }
}

@Preview(showBackground = true, widthDp = 400, heightDp = 400)
@Composable
fun MyBox2PreviewAlign() {
    MyBox2align()
}

@Preview(showBackground = true, widthDp = 400, heightDp = 400)
@Composable
fun MyBox3PreviewContentAlignment() {
    MyBox3()
}

@Preview(showBackground = true, widthDp = 400, heightDp = 400)
@Composable
fun MyBox3alignPreview() {
    MyBox3align()
}
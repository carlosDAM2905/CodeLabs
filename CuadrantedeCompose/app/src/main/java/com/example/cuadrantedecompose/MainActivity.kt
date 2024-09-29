package com.example.cuadrantedecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cuadrantedecompose.ui.theme.CuadranteDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CuadranteDeComposeTheme {
                 GreetingPreview()


                }
            }
        }
    }


@Composable
fun Cuadrante1(text: String, text2: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxWidth(0.5f)
            .fillMaxHeight(0.5f)
            .background(Color(0xFFEADDFF)),
        contentAlignment = Alignment.Center

    ) {

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = text,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(8.dp),
        )

        Text(
            text = text2,
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(8.dp),

        )
        }
    }
}


@Composable
fun Cuadrante2(text: String, text2: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxWidth(1f)
            .fillMaxHeight(0.5f)
            .background(Color(0xFFD0BCFF)),
        contentAlignment = Alignment.Center
    ) {
        Column (
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = text,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(8.dp)
            )

            Text(
                text = text2,
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(8.dp)
            )

        }
    }
}




@Composable
fun Cuadrante3(text: String, text2: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .padding(bottom = 48.dp)
            .fillMaxWidth(0.5f)
            .fillMaxHeight(1f)
            .background(Color(0xFFB69DF8)),
        contentAlignment = Alignment.Center
    ) {
        Column (
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = text,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(8.dp)
            )

            Text(
                text = text2,
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(8.dp)
            )

        }
    }
}

@Composable
fun Cuadrante4(text: String, text2: String, modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .padding(bottom = 48.dp)
            .fillMaxHeight(1f)
            .fillMaxWidth(1f)
            .background(Color(0xFFF6EDFF))

    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(
                text = text,
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier
                    .padding(8.dp)
            )

            Text(
                text = text2,
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Justify,
                modifier = modifier
                    .padding(8.dp)
            )
        }



    }
}






@Preview(showBackground = true, name = "My preview", showSystemUi = true)
@Composable
fun GreetingPreview() {
    CuadranteDeComposeTheme {

        Row(modifier = Modifier.fillMaxSize()) {

            Column(modifier = Modifier) {

                Cuadrante1(
                    text = stringResource(R.string.cabecera1),
                    text2 = stringResource(R.string.cuerpo1)
                )

                Cuadrante3(
                    text = stringResource(R.string.cabecera2),
                    text2 = stringResource(R.string.cuerpo2)
                )
            }

            Column(modifier = Modifier) {

                Cuadrante2(
                    text = stringResource(R.string.cabecera3),
                    text2 = stringResource(R.string.cuerpo3)
                )

                Cuadrante4(
                    text = stringResource(R.string.cabecera4),
                    text2 = stringResource(R.string.cuerpo4)
                )


            }



        }

    }
}
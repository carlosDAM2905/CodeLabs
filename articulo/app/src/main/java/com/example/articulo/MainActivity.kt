package com.example.articulo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articulo.ui.theme.ArticuloTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArticuloTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Imagen()
                        Articulo(
                            stringResource(R.string.titulo),
                            stringResource(R.string.cabecera),
                            stringResource(R.string.cuerpo)
                        )
                    }

                }
                }
            }
        }
    }

@Composable
fun Imagen(modifier: Modifier = Modifier) {
    Box(contentAlignment = Alignment.TopStart,
        modifier = Modifier

    ) {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        )
    }

}

@Composable
fun Articulo(titulo: String, cabecera: String, cuerpo: String, modifier: Modifier = Modifier) {
    Column(
           verticalArrangement = Arrangement.Top,
           modifier = Modifier

        ) {

        Text(
            text = titulo,
            fontSize = 26.sp,
            lineHeight = 50.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                       .fillMaxWidth()
                       .padding(16.dp)
        )

        Text(
            text = cabecera,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                       .fillMaxWidth()
                       .padding(16.dp)
        )

        Text(
            text = cuerpo,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                       .fillMaxWidth()
                       .padding(16.dp)
        )
    }
}




@Preview(showBackground = true, name = "My preview", showSystemUi = true)
@Composable
fun GreetingPreview() {
    ArticuloTheme {
        Column {
            Imagen()
            Articulo(
                stringResource(R.string.titulo),
                stringResource(R.string.cabecera),
                stringResource(R.string.cuerpo)
            )
        }

    }
}
package com.example.pantallaadministradordetareas

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.pantallaadministradordetareas.ui.theme.PantallaAdministradorDeTareasTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PantallaAdministradorDeTareasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AllTaskCompleted(
                        text1 = stringResource(R.string.text1),
                        text2 = stringResource(R.string.text2),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun AllTaskCompleted(text1: String, text2: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Image(
            painter = painterResource(R.drawable.ic_task_completed),
            contentDescription = stringResource(R.string.descripcion_imagen),
            alignment = Alignment.Center,
            modifier = Modifier
                .height(200.dp)
                .width(200.dp)
                .padding(16.dp)

        )

        Text(
            text = text1,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, bottom = 8.dp)

        )

        Text(
            text = text2,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )

    }

}


@Preview(showBackground = true, name = "My preview", showSystemUi = true)
@Composable
fun GreetingPreview() {
    PantallaAdministradorDeTareasTheme {
        Column {
        AllTaskCompleted(
            stringResource(R.string.text1),
            stringResource(R.string.text2)
        )
        }
    }
}
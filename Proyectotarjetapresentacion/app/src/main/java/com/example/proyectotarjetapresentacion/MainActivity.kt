package com.example.proyectotarjetapresentacion

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectotarjetapresentacion.ui.theme.ProyectoTarjetaPresentacionTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoTarjetaPresentacionTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {

                    Surface(modifier = Modifier

                    ) {
                        PresentacionPreview()

                    }
                }
            }
        }
    }
}

@Composable
fun Presentacion(
    logoAndroid: Painter,
    nombre: String,
    puesto: String,
    modifier: Modifier = Modifier
) {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.fondo),
            contentDescription = "fondo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Box(
                modifier = Modifier
                    .height(300.dp)
                    .width(300.dp)

            )
            {

                Image(
                    painter = painterResource(id = R.drawable.android_logo),
                    contentDescription = "Imagen del logo android",
                    modifier = Modifier
                        .height(300.dp)
                        .width(300.dp),
                )
            }
            Text(
                text = nombre,
                textAlign = TextAlign.Center,
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(16.dp)
            )

            Text(
                text = puesto,
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold

            )
        }
    }
}

@Composable
fun Contacto(iconTfn: Painter,
             iconContacto: Painter,
             iconEmail: Painter,
             telefono: String,
             compartir: String,
             email: String,
             modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .padding(32.dp)
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Row(modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
            ) {

            Icon(
                painter = painterResource(R.drawable.telefono),
                contentDescription = "icono teléfono",
                tint = Color.White,
                modifier = Modifier
                    .padding(8.dp)
                    .height(15.dp)
                    .width(15.dp)
            )

            Text(
                text = telefono,
                color = Color.White,
                textAlign = TextAlign.Justify,
                fontSize = 16.sp,
                modifier = Modifier.padding(8.dp)
            )
        }

            Row (
                modifier = Modifier.fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
            Icon(
                painter = painterResource(R.drawable.email),
                contentDescription = "icono email",
                tint = Color.White,
                modifier = Modifier
                    .padding(8.dp)
                    .height(15.dp)
                    .width(15.dp)
            )

                Text(
                    text = email,
                    color = Color.White,
                    textAlign = TextAlign.Justify,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(2.dp)
                )

            }

            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
            Icon(
                painter = painterResource(R.drawable.compartir),
                contentDescription = "icono compartir",
                tint = Color.White,
                modifier = Modifier
                    .padding(8.dp)
                    .height(15.dp)
                    .width(15.dp)
            )

                Text(
                    text = compartir,
                    color = Color.White,
                    textAlign = TextAlign.Justify,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(2.dp)
                )

        }
    }
}


@Preview(showBackground = true)
@Composable
fun PresentacionPreview() {
    ProyectoTarjetaPresentacionTheme {

            Presentacion(
                logoAndroid = painterResource(R.drawable.android_logo),
                nombre = stringResource(R.string.nombre),
                puesto = stringResource(R.string.descripcion),
                modifier = Modifier
            )

            Contacto(
                iconTfn = painterResource(R.drawable.telefono),
                telefono = stringResource(R.string.telefono),
                iconEmail = painterResource(R.drawable.email),
                email = stringResource(R.string.email),
                iconContacto = painterResource(R.drawable.compartir),
                compartir = stringResource(R.string.contacto)

            )

    }
}


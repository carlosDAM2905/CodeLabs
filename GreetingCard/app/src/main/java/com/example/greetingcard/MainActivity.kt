package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.GreetingCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Carlos",
                        modifier = Modifier.padding(innerPadding)
                    )
                   
                }
            }
            Description(37, "Madrid", "carlosdam2905@gmail.com")

        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
        Surface(color = Color.Magenta) {
            Text(
                text = "Hi, my name is $name!",
                modifier = modifier
                    .padding(24.dp)
                    .wrapContentSize(Alignment.Center)
                    .border(width = 2.dp, color = Color.Blue, shape = RoundedCornerShape(0.dp))
                    .padding(7.dp), fontSize = 24.sp, fontFamily = FontFamily.Serif
            )


        }
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        Greeting("Carlos")
        Description(37, "Madrid", "pepito@gmail.com")
    }
}

@Composable
fun Description(age: Int, bornCity: String, email: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(95.dp)
    ) {
        Surface(color = Color.Blue) {
            Text(
                text = "Tengo $age años de edad",
                fontSize = 10.sp,
                fontFamily = FontFamily.Serif
            )
        }


        Surface(color = Color.Red) {
            Text(
                text = "He nacido en $bornCity",
                fontSize = 10.sp,
                fontFamily = FontFamily.Serif
            )
        }


        Surface(color = Color.Magenta) {
            Text(
                text = "Email $email",
                fontSize = 10.sp,
                fontFamily = FontFamily.Serif
            )
        }
    }
}



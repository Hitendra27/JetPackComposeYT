package com.example.jetpackcomposeyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposeyt.ui.theme.JetPackComposeYTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeYTTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    //modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    Row(
    ) {
        Greeting()

    }
}

@Composable
fun Greeting(
    //name: String,
    //modifier: Modifier = Modifier
    ) {
    Column(
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxSize(0.5f),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Text(
            text = "Hello Sanjay",
        )
        Text(text = "John")
    }
}


@Composable
fun Greeting2(
    //name: String,
    //modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize(0.5f),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Text(
            text = "Hello Sanjay",
        )
        Text(text = "John")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackComposeYTTheme {
        //Greeting("Sanjay")
    }
}
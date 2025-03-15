package com.example.md2_lab002__retrofit.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.md2_lab002__retrofit.ui.theme.MD2_Lab002__RetrofitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MD2_Lab002__RetrofitTheme(darkTheme = true) {
                CharacterScreen()
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun WeatherViewPreview() {
    MD2_Lab002__RetrofitTheme(darkTheme = true) {
        CharacterScreen()
    }
}
package com.example.siridhanyahub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import com.example.siridhanyahub.screens.*

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            SiriDhanyaHubApp()
        }
    }
}

@Composable
fun SiriDhanyaHubApp() {

    var screen by remember {

        mutableStateOf("welcome")
    }

    when (screen) {

        "welcome" -> WelcomeScreen(

            onStart = {

                screen = "home"
            }
        )

        "home" -> HomeScreen(

            onRecipe = {

                screen = "recipe"
            },

            onHealth = {

                screen = "health"
            },

            onMandi = {

                screen = "mandi"
            },

            onBuy = {

                screen = "buy"
            },

            onAbout = {

                screen = "about"
            }
        )

        "recipe" -> RecipeScreen(

            onBack = {

                screen = "home"
            }
        )

        "health" -> HealthScreen(

            onBack = {

                screen = "home"
            }
        )

        "mandi" -> MandiScreen(

            onBack = {

                screen = "home"
            }
        )

        "buy" -> BuyScreen(

            onBack = {

                screen = "home"
            }
        )

        "about" -> AboutScreen(

            onBack = {

                screen = "home"
            }
        )
    }
}
package com.example.siridhanyahub.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HealthScreen(
    onBack: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE8F5E9))
            .padding(20.dp)
    ) {

        Text(
            text = "💚 Health Benefits",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1B5E20)
        )

        Spacer(modifier = Modifier.height(25.dp))

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column(
                modifier = Modifier.padding(20.dp)
            ) {

                Text("• Rich in Fiber", fontSize = 20.sp)

                Spacer(modifier = Modifier.height(15.dp))

                Text("• Helps Weight Loss", fontSize = 20.sp)

                Spacer(modifier = Modifier.height(15.dp))

                Text("• Controls Diabetes", fontSize = 20.sp)

                Spacer(modifier = Modifier.height(15.dp))

                Text("• Improves Digestion", fontSize = 20.sp)
            }
        }

        Spacer(modifier = Modifier.height(25.dp))

        Button(
            onClick = onBack,
            modifier = Modifier.fillMaxWidth()
        ) {

            Text("Back")
        }
    }
}
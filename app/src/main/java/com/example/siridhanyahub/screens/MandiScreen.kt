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
fun MandiScreen(
    onBack: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFF3E0))
            .padding(20.dp)
    ) {

        Text(
            text = "🌾 Mandi Watch",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFE65100)
        )

        Spacer(modifier = Modifier.height(25.dp))

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column(
                modifier = Modifier.padding(20.dp)
            ) {

                Text("Ragi : ₹42/kg", fontSize = 20.sp)

                Spacer(modifier = Modifier.height(15.dp))

                Text("Bajra : ₹38/kg", fontSize = 20.sp)

                Spacer(modifier = Modifier.height(15.dp))

                Text("Jowar : ₹45/kg", fontSize = 20.sp)
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
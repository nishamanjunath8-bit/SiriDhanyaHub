package com.example.siridhanyahub.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(
    onRecipe: () -> Unit,
    onHealth: () -> Unit,
    onMandi: () -> Unit,
    onBuy: () -> Unit,
    onAbout: () -> Unit
) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
            .padding(20.dp)
    ) {

        item {

            Text(
                text = "🌾 Siri Dhanya Hub",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2E7D32)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Healthy Millet Companion",
                fontSize = 18.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(30.dp))
        }

        item {
            DashboardCard(
                "🍲 Recipe Lab",
                "Healthy millet recipes",
                Color(0xFF8E24AA),
                Color(0xFFCE93D8),
                onRecipe
            )
        }

        item {
            DashboardCard(
                "💚 Health Benefits",
                "Millet nutrition and wellness",
                Color(0xFF2E7D32),
                Color(0xFFA5D6A7),
                onHealth
            )
        }

        item {
            DashboardCard(
                "🌾 Mandi Watch",
                "Track millet prices",
                Color(0xFFF57C00),
                Color(0xFFFFCC80),
                onMandi
            )
        }

        item {
            DashboardCard(
                "🛒 Direct Buy",
                "Buy millet products",
                Color(0xFF1565C0),
                Color(0xFF90CAF9),
                onBuy
            )
        }

        item {
            DashboardCard(
                "📖 About Millets",
                "Learn about Siridhanya",
                Color(0xFFD32F2F),
                Color(0xFFEF9A9A),
                onAbout
            )
        }
    }
}

@Composable
fun DashboardCard(
    title: String,
    subtitle: String,
    color1: Color,
    color2: Color,
    onClick: () -> Unit
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 20.dp)
            .height(140.dp)
            .clip(RoundedCornerShape(28.dp))
            .clickable {
                onClick()
            }
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(color1, color2)
                    )
                )
                .padding(20.dp)
        ) {

            Column {

                Text(
                    text = title,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = subtitle,
                    fontSize = 17.sp,
                    color = Color.White
                )
            }
        }
    }
}
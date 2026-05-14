package com.example.siridhanyahub.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.siridhanyahub.model.Recipe

val recipeList = listOf(

    Recipe(
        "Ragi Dosa",

        "• Ragi Flour\n• Onion\n• Salt\n• Water",

        "1. Mix ingredients\n\n" +
                "2. Prepare batter\n\n" +
                "3. Cook on pan\n\n" +
                "4. Serve hot"
    ),

    Recipe(
        "Millet Pongal",

        "• Millet\n• Moong Dal\n• Pepper\n• Ghee",

        "1. Cook millet\n\n" +
                "2. Add seasoning\n\n" +
                "3. Mix properly\n\n" +
                "4. Serve"
    )
)

@Composable
fun RecipeScreen(
    onBack: () -> Unit
) {

    var selectedRecipe by remember {
        mutableStateOf<Recipe?>(null)
    }

    if (selectedRecipe == null) {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFFF8E1))
                .padding(20.dp)
        ) {

            item {

                Text(
                    text = "🍲 Millet Recipes",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF6A1B9A)
                )

                Spacer(modifier = Modifier.height(25.dp))
            }

            items(recipeList) { recipe ->

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp)
                        .clickable {

                            selectedRecipe = recipe
                        },

                    shape = RoundedCornerShape(24.dp)
                ) {

                    Column(
                        modifier = Modifier.padding(22.dp)
                    ) {

                        Text(
                            text = recipe.name,
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = "Tap to view full recipe",
                            fontSize = 16.sp
                        )
                    }
                }
            }

            item {

                Spacer(modifier = Modifier.height(10.dp))

                Button(
                    onClick = onBack,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    Text("Back")
                }
            }
        }

    } else {

        RecipeDetailScreen(
            recipe = selectedRecipe!!,
            onBack = {

                selectedRecipe = null
            }
        )
    }
}

@Composable
fun RecipeDetailScreen(
    recipe: Recipe,
    onBack: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFF8E1))
            .padding(20.dp)
    ) {

        Text(
            text = recipe.name,
            fontSize = 34.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6A1B9A)
        )

        Spacer(modifier = Modifier.height(25.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(24.dp)
        ) {

            Column(
                modifier = Modifier.padding(20.dp)
            ) {

                Text(
                    text = "Ingredients",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = recipe.ingredients,
                    fontSize = 18.sp
                )

                Spacer(modifier = Modifier.height(25.dp))

                Text(
                    text = "Preparation",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = recipe.steps,
                    fontSize = 18.sp
                )
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
package com.example.waterbottlecanvas.waterBottleScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WaterBottleScreen() {

    var usedWaterAmount by remember {
        mutableIntStateOf(0)
    }

    val totalWaterAmount by remember {
        mutableIntStateOf(2400)
    }


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        WaterBottle(
            totalWaterAmount = totalWaterAmount,
            unit = "ml",
            usedWaterAmount = usedWaterAmount,
            modifier = Modifier.width(250.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Total Amount of Water: $totalWaterAmount",
            fontSize = 18.sp
        )

        Button(onClick = {
            if (usedWaterAmount < totalWaterAmount){
                usedWaterAmount += 200
            }else{
                usedWaterAmount = totalWaterAmount
            }
        }
        ) {
            Text(
                text = "Drink"
            )
        }


    }

}
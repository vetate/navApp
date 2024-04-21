package com.example.navapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navapp.ui.theme.Homebg

@Composable
fun Cart(){
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Homebg)
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Shopping Cart", fontSize = 30.sp, color = Color.White)

            Image(
                painter = painterResource(id = R.drawable.cart),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(350.dp, 300.dp)
                    .padding(vertical = 8.dp)
            )


        }
    }
}
@Preview
@Composable
fun CaryPreview() {
    Cart()
}
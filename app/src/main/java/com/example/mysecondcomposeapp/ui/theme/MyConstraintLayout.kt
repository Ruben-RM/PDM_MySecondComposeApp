package com.example.mysecondcomposeapp.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showBackground = true)
@Composable
fun MyConstraintLayout()
{
    ConstraintLayout(modifier = Modifier.fillMaxSize())
    {
        val (blackBox, cyanBox1, cyanBox2, cyanBox3, cyanBox4, purpleBox1, purpleBox2, purpleBox3, purpleBox4) = createRefs()

        Box(modifier = Modifier.size(30.dp)
            .background(Color.Black)
            .constrainAs(ref = blackBox)
            {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            })

        Box(modifier = Modifier.size(30.dp)
            .background(Teal)
            .constrainAs(ref = cyanBox1)
            {
                bottom.linkTo(blackBox.top)
                end.linkTo(blackBox.start)
            })

        Box(modifier = Modifier.size(30.dp)
            .background(Teal)
            .constrainAs(ref = cyanBox2)
            {
                bottom.linkTo(blackBox.top)
                start.linkTo(blackBox.end)
            })

        Box(modifier = Modifier.size(30.dp)
            .background(Teal)
            .constrainAs(ref = cyanBox3)
            {
                top.linkTo(blackBox.bottom)
                end.linkTo(blackBox.start)
            })

        Box(modifier = Modifier.size(30.dp)
            .background(Teal)
            .constrainAs(ref = cyanBox4)
            {
                top.linkTo(blackBox.bottom)
                start.linkTo(blackBox.end)
            })

        Box(modifier = Modifier.size(30.dp)
            .background(Purple)
            .constrainAs(ref = purpleBox1)
            {
                bottom.linkTo(cyanBox1.top)
                start.linkTo(cyanBox1.end)
            })

        Box(modifier = Modifier.size(30.dp)
            .background(Purple)
            .constrainAs(ref = purpleBox2)
            {
                top.linkTo(cyanBox3.bottom)
                end.linkTo(cyanBox3.start)
            })

        Box(modifier = Modifier.size(30.dp)
            .background(Purple)
            .constrainAs(ref = purpleBox3)
            {
                top.linkTo(cyanBox3.bottom)
                start.linkTo(cyanBox3.end)
            })

        Box(modifier = Modifier.size(30.dp)
            .background(Purple)
            .constrainAs(ref = purpleBox4)
            {
                top.linkTo(cyanBox3.bottom)
                start.linkTo(cyanBox4.end)
            })
    }
}
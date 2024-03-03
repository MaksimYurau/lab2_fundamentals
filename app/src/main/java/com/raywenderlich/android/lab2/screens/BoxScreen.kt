package com.raywenderlich.android.lab2.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.raywenderlich.android.lab2.router.BackButtonHandler
import com.raywenderlich.android.lab2.router.FundamentalsRouter
import com.raywenderlich.android.lab2.router.Screen

@Composable
fun BoxScreen() {
    MyBox()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyBox(modifier: Modifier = Modifier) {
    //TODO write your code here
}
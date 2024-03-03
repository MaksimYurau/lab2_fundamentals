package com.raywenderlich.android.lab2.screens

import androidx.compose.runtime.Composable
import com.raywenderlich.android.lab2.router.BackButtonHandler
import com.raywenderlich.android.lab2.router.FundamentalsRouter
import com.raywenderlich.android.lab2.router.Screen

@Composable
fun ColumnScreen() {
    MyColumn()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyColumn() {
    //TODO write your code here
}

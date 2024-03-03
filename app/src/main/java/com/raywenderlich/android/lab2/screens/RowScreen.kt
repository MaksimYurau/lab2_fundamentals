package com.raywenderlich.android.lab2.screens

import androidx.compose.runtime.Composable
import com.raywenderlich.android.lab2.R
import com.raywenderlich.android.lab2.router.BackButtonHandler
import com.raywenderlich.android.lab2.router.FundamentalsRouter
import com.raywenderlich.android.lab2.router.Screen

val THREE_ELEMENT_LIST = listOf(R.string.first, R.string.second, R.string.third)

@Composable
fun RowScreen() {
    MyRow()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyRow() {
    //TODO write your code here
}
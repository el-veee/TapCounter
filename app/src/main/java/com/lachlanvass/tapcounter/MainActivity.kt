package com.lachlanvass.tapcounter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.lachlanvass.tapcounter.ui.theme.TapCounterTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        var viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        setContent {
            TapCounterTheme {

                navController = rememberNavController()
                SetupNavGraph(
                    navHostController = navController,
                    viewModel

                    )

            }
        }

    }
}


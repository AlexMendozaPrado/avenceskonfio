package com.example.movieDb.core.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieDb.movieList.presentation.MovieListViewModel
import com.example.movieDb.movieList.util.Screen
import com.example.movieDb.ui.theme.MovieDBTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovieDBTheme {
                SetBarColor(MaterialTheme.colorScheme.inverseOnSurface)
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                    ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController,startDestination = Screen.Home.rout
                    ){
                        composable(Screen.Home.rout){
                            HomeScreen(navController)
                        }
                        composable(Screen.Details.rout + "/{movieId}",
                            arguments = listOf(
                                navArgument(""){type = NavType.IntType}
                            )
                        ){ backstackEntry->
                           // DetailsScreen()
                        }

                    }


                }


            }
        }
    }
    @Composable
    private fun SetBarColor(color : Color){
        val systemUiController = rememberSystemUiController()
        LaunchedEffect(key1=color){
            systemUiController.setStatusBarColor(color)
        }

    }
}


package com.caren.coroutinesexercise

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    fun startTimer() {
        viewModelScope.launch(Dispatchers.Default) {
            // Start 5 second timer
            Log.i("MainActivity", "Start 5 second timer")
            Thread.sleep(5000)
            Log.i("MainActivity", "5 second timer ended")
        }

    }
}
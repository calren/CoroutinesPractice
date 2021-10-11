package com.caren.coroutinesexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel: MainViewModel by viewModels()

        var num = 0

        findViewById<Button>(R.id.button).setOnClickListener {
            num++
            findViewById<TextView>(R.id.textView).text = num.toString()
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            viewModel.startTimer()
        }
    }
}
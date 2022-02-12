package com.asafin24.doubletapp_2zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.asafin24.doubletapp_2zadanie.databinding.Activity2Binding
import com.asafin24.doubletapp_2zadanie.databinding.ActivityMainBinding

class Activity2 : AppCompatActivity() {

    lateinit var binding: Activity2Binding
    private var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        number = intent.getIntExtra("number", 0)
        binding.tvNumber2.text = (number*number).toString()

        Log.i("SecondActivity", "onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.i("SecondActivity", "onStart()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("SecondActivity", "onRestart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("SecondActivity", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("SecondActivity", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("SecondActivity", "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("SecondActivity", "onDestroy()")
    }
}
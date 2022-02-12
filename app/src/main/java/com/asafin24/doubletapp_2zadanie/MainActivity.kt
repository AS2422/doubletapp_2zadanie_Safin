package com.asafin24.doubletapp_2zadanie

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.asafin24.doubletapp_2zadanie.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this@MainActivity, Activity2::class.java)
            intent.putExtra("number", count)
            startActivity(intent)
        }
        Log.i("MainActivity", "onCreate()")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        count++
        binding.tvNumber.text = count.toString()

    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity", "onRestart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy()")
    }

}
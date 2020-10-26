package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        Log.d("Life_cycle_activity ", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Life_cycle_activity ", "onStart")
    }

    override fun onResume() {
        Log.d("Life_cycle_activity ", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("Life_cycle_activity ", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("Life_cycle_activity ", "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("Life_cycle_activity ", "onDestroy")
        super.onDestroy()
    }
}
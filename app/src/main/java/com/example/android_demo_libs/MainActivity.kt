package com.example.android_demo_libs

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.mylibrary.HelloWorld


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val a = 6;
        val b = 10;
        HelloWorld.sum(a, b)
        Log.d("Result", HelloWorld.sum(a, b).toString())
    }
}
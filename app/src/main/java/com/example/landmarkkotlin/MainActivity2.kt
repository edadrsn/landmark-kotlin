package com.example.landmarkkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.landmarkkotlin.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var binding:ActivityMain2Binding

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
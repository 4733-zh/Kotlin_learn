package com.example.activitylifecycletest

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitylifecycletest.databinding.NormalLayoutBinding

class NormalActivity : AppCompatActivity() {

    private lateinit var binding: NormalLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = NormalLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
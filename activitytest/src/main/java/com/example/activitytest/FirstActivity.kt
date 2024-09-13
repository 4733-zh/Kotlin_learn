package com.example.activitytest

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitytest.databinding.FirstLayoutBinding

class FirstActivity : AppCompatActivity() {
    private lateinit var binding: FirstLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FirstLayoutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
//        val button1:Button = findViewById(R.id.button1)
//        button1.setOnClickListener{
//            Toast.makeText(this,"You clicked Button 1",Toast.LENGTH_LONG).show()
        binding.button1.setOnClickListener{
            Toast.makeText(this,"You clicked Button 1",Toast.LENGTH_LONG).show()
        }

    }
}
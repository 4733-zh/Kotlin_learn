package com.example.uiwidgettest

import android.os.Binder
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uiwidgettest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)

    }
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button1->{
                val inputText = binding.editText.text.toString()
                Toast.makeText(this,inputText,Toast.LENGTH_SHORT).show()
            }
            R.id.button2->{
                binding.imageView.setImageResource(R.drawable.img_2)
            }
        }
    }
}
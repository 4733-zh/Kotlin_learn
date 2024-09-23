package com.example.activitytest

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitytest.databinding.ThirdLayoutBinding

class ThirdActivity : BaseActivity() {

    private lateinit var binding:ThirdLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.third_layout)
        binding = ThirdLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button3.setOnClickListener{
            ActivityCollector.finishAll()
        }
    }
}
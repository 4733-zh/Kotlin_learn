package com.example.activitytest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        val  button2:Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent()
            intent.putExtra("data_return","Hello FirstActiviity")
            setResult(RESULT_OK,intent)
            finish()
        }
    }
}
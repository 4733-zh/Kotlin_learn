package com.example.activitylifecycletest

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.activitylifecycletest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag,"OnCreate")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.startNormalActivity.setOnClickListener{
            val intent = Intent(this,NormalActivity::class.java)
            startActivity(intent)
        }
        binding.startDialogActivity.setOnClickListener{
            val intent = Intent(this,DialogActivity::class.java)
            startActivity(intent)
        }
        if (savedInstanceState!=null){
            val tempData =savedInstanceState.getString("data_key")
            if (tempData != null) {
                Log.d(tag,tempData)
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val tempData = "Something you just typed"
        outState.putString("data_key",tempData)
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag,"onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag,"onRestart")
    }
}
package com.example.uiwidgettest

import android.os.Binder
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
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
        binding.button3.setOnClickListener(this)
        binding.button4.setOnClickListener(this)

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
            R.id.button3->{
//                if (binding.progressBar.visibility == View.VISIBLE) {
//                    binding.progressBar.visibility = View.GONE
//                }else{
//                    binding.progressBar.visibility = View.VISIBLE
//                }
                binding.progressBar.progress = binding.progressBar.progress + 10
            }
            R.id.button4->{
                AlertDialog.Builder(this).apply {
                    setTitle("This is Dialog")
                    setMessage("Something important")
                    setCancelable(false)
                    setPositiveButton("OK"){dialog,which->}
                    setNegativeButton("Cancel"){dialog,which->}
                    show()

                }

            }
        }
    }
}
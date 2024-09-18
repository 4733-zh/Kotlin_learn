package com.example.activitytest

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitytest.databinding.FirstLayoutBinding

class FirstActivity : AppCompatActivity() {
    private lateinit var binding: FirstLayoutBinding

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_item->Toast.makeText(this,"You clicked Add",Toast.LENGTH_SHORT).show()
            R.id.remove_item->Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show()
        }
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FirstLayoutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
//        val button1:Button = findViewById(R.id.button1)
//        button1.setOnClickListener{
//            Toast.makeText(this,"You clicked Button 1",Toast.LENGTH_LONG).show()
        binding.button1.setOnClickListener{
//            Toast.makeText(this,"You clicked Button 1",Toast.LENGTH_LONG).show()
            finish()
        }

    }
}
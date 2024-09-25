package com.example.uicustomviews

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.Toast
import com.example.uicustomviews.databinding.TitleBinding

class TitleLayout (context : Context,attrs : AttributeSet):LinearLayout(context,attrs) {

    private lateinit var binding: TitleBinding

    init {

//        LayoutInflater.from(context).inflate(R.layout.title,this)
        binding = TitleBinding.inflate(LayoutInflater.from(getContext()), this, true)
        binding.titleBack.setOnClickListener{
            val activity = context as Activity
            activity.finish()
        }
        binding.titleEdit.setOnClickListener {
            Toast.makeText(context,"You clicked Edit button",Toast.LENGTH_SHORT).show()
        }

    }

}
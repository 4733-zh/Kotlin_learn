package com.example.uibestpractice

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

sealed class MyViewHolder(view: View):RecyclerView.ViewHolder(view) {
    class LeftViewHolder(view: View):MyViewHolder(view) {
        val leftMsg: TextView = view.findViewById(R.id.leftMsg)
    }
    class RightViewHolder(view: View):MyViewHolder(view) {
        val rightMsg: TextView = view.findViewById(R.id.rightMsg)
    }
}
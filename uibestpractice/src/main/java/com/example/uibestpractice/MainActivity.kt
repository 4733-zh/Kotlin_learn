package com.example.uibestpractice

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uibestpractice.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private val tag = "MainActivity"
    private lateinit var adapter: MsgAdapter
    private val msgList = ArrayList<Msg>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initMsg()
        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager
        adapter = MsgAdapter(msgList)
        binding.recyclerView.adapter = adapter
        binding.send.setOnClickListener (this)
    }

    private fun initMsg() {
        val msg1 = Msg("Hello guy", Msg.TYPE_RECEIVED)
        msgList.add(msg1)
        val msg2 = Msg("Hello, who is that?", Msg.TYPE_SENT)
        msgList.add(msg2)
        val msg3 = Msg("This is Tom. Nice talking to you", Msg.TYPE_RECEIVED)
        msgList.add(msg3)
    }

    override fun onClick(v: View?) {
        when (v) {
            binding.send -> {
                val content = binding.inputText.text.toString()
                if (content.isNotEmpty()) {
                    val msg = Msg(content, Msg.TYPE_SENT)
                    msgList.add(msg)
                    adapter.notifyItemInserted(msgList.size - 1)
                    binding.recyclerView.scrollToPosition(msgList.size - 1)
                    binding.inputText.setText("")
                }
            }
        }
    }
}
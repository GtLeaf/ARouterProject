package com.mingdi.arouterproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        setListener()
    }

    private fun init() {}

    private fun setListener() {
        btn_go_home.setOnClickListener {

        }

        btn_go_chat.setOnClickListener {

        }
    }
}

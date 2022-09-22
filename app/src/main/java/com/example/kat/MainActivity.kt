package com.example.kat

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.layout_main)
        val btn_hello:Button = findViewById<Button>(R.id.btn_hello)

        btn_hello.setOnClickListener() {
            Toast.makeText(this, "토스트메시지",Toast.LENGTH_SHORT).show()
        }
        //내용 작성하기
    }
}
package com.example.kat

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : Activity() {

    private var i : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.layout_main)
        val btn_hello:Button = findViewById<Button>(R.id.btn_hello)

        btn_hello.setOnClickListener() {
            i++
            Toast.makeText(this, "토스트메시지22"+ i,Toast.LENGTH_SHORT).show()
            if(i >= 3)
            {
                i = 0
                val nextIntent = Intent(this, com.example.kat.view.MainActivity::class.java)
                startActivity(nextIntent)
            }
        }
        //내용 작성하기
    }
}
package com.daniel.zsar.finalprojectapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)







    }
    fun addEvents(){
        var textView = findViewById<TextView>(R.id.textView1)
        var button1 = findViewById<Button>(R.id.button1)
        var button2 = findViewById<Button>(R.id.button2)
        button1.setOnClickListener(View.OnClickListener {
            textView.text = button1.text
        })
        button2.setOnClickListener(View.OnClickListener {
            textView.text = button2.text
        })
    }
}
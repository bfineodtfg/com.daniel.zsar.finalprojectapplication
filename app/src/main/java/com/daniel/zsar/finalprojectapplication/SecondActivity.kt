package com.daniel.zsar.finalprojectapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        load()
    }
    fun load(){
        val textView1 = findViewById<TextView>(R.id.textView2)
        val textView2 = findViewById<TextView>(R.id.editText4)
        //val intent = getIntent()
        val one = intent.getStringExtra("one")
        val two = intent.getStringExtra("two")
        textView1.text = one
        textView2.text = two
        val stringArray = arrayOf("Oh, the weather outside is frightful", "But the fire is so delightful", "And since we've no place to go", "Let It Snow! Let It Snow! Let It Snow!", "Man it doesn't show signs of stopping", "And I brought me some corn for popping", "The lights are turned way down low", "Let It Snow! Let It Snow!", "When we finally kiss goodnight", "How I'll hate going out in the storm", "But if you'll really hold me tight", "All the way home I'll be warm", "And the fire is slowly dying", "And, my dear, we're still goodbying", "But as long as you'd love me so", "Let It Snow! Let It Snow and snow!")
        val adapter = MyAdapter(stringArray)
        val recycleViewer: RecyclerView = findViewById(R.id.recyclerView)

    }
    //"Oh, the weather outside is frightful", "But the fire is so delightful", "And since we've no place to go", "Let It Snow! Let It Snow! Let It Snow!", "Man it doesn't show signs of stopping", "And I brought me some corn for popping", "The lights are turned way down low", "Let It Snow! Let It Snow!", "When we finally kiss goodnight", "How I'll hate going out in the storm", "But if you'll really hold me tight", "All the way home I'll be warm", "And the fire is slowly dying", "And, my dear, we're still goodbying", "But as long as you'd love me so", "Let It Snow! Let It Snow and snow!"
}
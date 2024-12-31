package com.daniel.zsar.finalprojectapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        load()
    }
    fun load(){
        val textView1 = findViewById<TextView>(R.id.textView2)
        val editText = findViewById<TextView>(R.id.editText4)
        //val intent = getIntent()
        val one = intent.getStringExtra("one")
        val two = intent.getStringExtra("two")
        textView1.text = one
        editText.text = two
        var stringArray : ArrayList<String> = arrayListOf("Oh, the weather outside is frightful", "But the fire is so delightful", "And since we've no place to go", "Let It Snow! Let It Snow! Let It Snow!", "Man it doesn't show signs of stopping", "And I brought me some corn for popping", "The lights are turned way down low", "Let It Snow! Let It Snow!", "When we finally kiss goodnight", "How I'll hate going out in the storm", "But if you'll really hold me tight", "All the way home I'll be warm", "And the fire is slowly dying", "And, my dear, we're still goodbying", "But as long as you'd love me so", "Let It Snow! Let It Snow and snow!")
        val adapter = MyAdapter(stringArray)
        val recycleViewer: RecyclerView = findViewById(R.id.recyclerView)
        recycleViewer.adapter = adapter
        recycleViewer.layoutManager = LinearLayoutManager(this)

        editText.setOnKeyListener( View.OnKeyListener{
                view,keyCode,event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP){
                stringArray.add(editText.text.toString())
                adapter.notifyDataSetChanged()
            }
            false
        })

        val button: Button = findViewById(R.id.button3)
        button.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, SensorActivity::class.java)
            startActivity(intent)
        })
    }
    fun addKeyEvent(input: EditText){

    }
    //"Oh, the weather outside is frightful", "But the fire is so delightful", "And since we've no place to go", "Let It Snow! Let It Snow! Let It Snow!", "Man it doesn't show signs of stopping", "And I brought me some corn for popping", "The lights are turned way down low", "Let It Snow! Let It Snow!", "When we finally kiss goodnight", "How I'll hate going out in the storm", "But if you'll really hold me tight", "All the way home I'll be warm", "And the fire is slowly dying", "And, my dear, we're still goodbying", "But as long as you'd love me so", "Let It Snow! Let It Snow and snow!"
}
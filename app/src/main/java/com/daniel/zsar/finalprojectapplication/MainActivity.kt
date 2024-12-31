package com.daniel.zsar.finalprojectapplication

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addEvents()
    }

    fun addEvents(){
        var textView = findViewById<TextView>(R.id.textView1)
        var input1 = findViewById<EditText>(R.id.editText1)
        var input2 = findViewById<EditText>(R.id.editText2)
        var button1 = findViewById<Button>(R.id.button1)
        var button2 = findViewById<Button>(R.id.button2)
        button1.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("one", input1.text.toString())
            intent.putExtra("two", input2.text.toString())
            textView.text = input1.text
            startActivity(intent)
        })
        button2.setOnClickListener(View.OnClickListener {
            if (ContextCompat.checkSelfPermission(this,Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED){
                button1.text = "yes"
                var intent = Intent(Intent.ACTION_CALL, Uri.parse("tel://1111111111"))
                startActivity(intent)
            }
            else{
                button1.text = "No"
                requestPermissions(
                    arrayOf(Manifest.permission.CALL_PHONE),
                    20
                )
            }


        })
    }
}
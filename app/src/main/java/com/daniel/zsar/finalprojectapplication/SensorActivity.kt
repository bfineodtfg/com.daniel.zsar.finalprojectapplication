package com.daniel.zsar.finalprojectapplication

import android.content.Intent
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class SensorActivity : AppCompatActivity(), SensorEventListener {
    private lateinit var sensorManager: SensorManager
    private var lightSensor : Sensor? = null
    private lateinit var text1: TextView
    private lateinit var text2: TextView
    private lateinit var text3: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sensor)
        load()


    }
    fun load(){
        text1 = findViewById(R.id.text1)
        text2 = findViewById(R.id.text2)
        text3 = findViewById(R.id.text3)

        try {
            sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
            lightSensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT)
        }
        catch (e: Exception){
            
        }



    }

    override fun onResume() {
        super.onResume()
        lightSensor?.also {
            sensorManager.registerListener(this,lightSensor,SensorManager.SENSOR_DELAY_NORMAL)
        }
    }

    override fun onPause() {
        super.onPause()
        lightSensor?.also {
            sensorManager.unregisterListener(this)
        }
    }
    override fun onSensorChanged(event: SensorEvent?) {
        text1.text = event?.values?.get(0).toString()
        text2.text = "valami van"
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }
}
package com.example.riadhfarhati.gps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b= findViewById(R.id.button) as Button
        b.setOnClickListener {

            var Gp=GPSTracker(applicationContext)
            var la=Gp.latitude
            var lg=Gp.longitude
            Toast.makeText(applicationContext," laltitude "+la+" langutude "+lg,1500).show()
        }
    }
}

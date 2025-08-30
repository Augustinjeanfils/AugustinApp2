package com.example.augustinapp

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val texviewBonneReponseButton= findViewById<TextView>(R.id.textViewbonneReponse)

        val textViewBadResponse1= findViewById<TextView>(R.id.textViewBadResponse1)
        val textViewBadResponse2= findViewById<TextView>(R.id.textViewBadResponse2)

        textViewBadResponse1.setOnClickListener {
            textViewBadResponse1.setBackgroundColor(getResources().getColor(R.color.red, null))
        }

        textViewBadResponse2.setOnClickListener {
            textViewBadResponse2.setBackgroundColor(getResources().getColor(R.color.red, null))
        }

        texviewBonneReponseButton.setOnClickListener {
            texviewBonneReponseButton.setBackgroundColor(getResources().getColor(R.color.green, null))
        }
    }
}





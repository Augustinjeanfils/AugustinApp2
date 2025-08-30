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
        val textviewquestion = findViewById<TextView>(R.id.textView_question)
        val texviewrepons = findViewById<TextView>(R.id.textView_response)
        texviewrepons.visibility = View.INVISIBLE

        textviewquestion.setOnClickListener {
            textviewquestion.visibility = View.INVISIBLE
            texviewrepons.visibility = View.VISIBLE
        }
    }
}





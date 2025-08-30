package com.example.augustinapp

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.ImageView
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
        val toggle_choices_visibility_true = findViewById<ImageView>(R.id.toggle_choices_visibility_true)
        val toggle_choices_visibility_false = findViewById<ImageView>(R.id.toggle_choices_visibility_false)

        // container response
        val containResponse = findViewById<View>(R.id.containResponse)

        // Hide Open eye Button
        toggle_choices_visibility_true.visibility = View.INVISIBLE
        // show Close eye Button
        toggle_choices_visibility_false.visibility = View.VISIBLE


        // handle Click on toggle_choices_visibility_false
        toggle_choices_visibility_false.setOnClickListener {
            toggle_choices_visibility_false.visibility = View.INVISIBLE
            toggle_choices_visibility_true.visibility = View.VISIBLE
            // Show response
            containResponse.visibility = View.INVISIBLE
        }

        // handle Click on toggle_choices_visibility_tue
        toggle_choices_visibility_true.setOnClickListener {
            toggle_choices_visibility_false.visibility = View.VISIBLE
            toggle_choices_visibility_true.visibility = View.INVISIBLE
            // Show response
            containResponse.visibility = View.VISIBLE
        }
        
        textViewBadResponse1.setOnClickListener {
            textViewBadResponse1.setBackgroundColor(getResources().getColor(R.color.red, null))
        }

        textViewBadResponse2.setOnClickListener {
            textViewBadResponse2.setBackgroundColor(getResources().getColor(R.color.red, null))
        }

        // Handle Bonne reponse
        texviewBonneReponseButton.setOnClickListener {
            texviewBonneReponseButton.setBackgroundColor(getResources().getColor(R.color.green, null))
            // reset bad response back to blue
            textViewBadResponse1.setBackgroundColor(getResources().getColor(R.color.blue, null))
            textViewBadResponse2.setBackgroundColor(getResources().getColor(R.color.blue, null))

        }
    }
}





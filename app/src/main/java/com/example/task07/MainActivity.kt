package com.example.task07


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout

class MainActivity : AppCompatActivity() {

    // Inicializamos las variables
    private lateinit var btnLinear : Button
    private lateinit var btnTable : Button
    private lateinit var btnRelative : Button
    private lateinit var btnGrid : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Asociamos las variables a los botones del activity.
        btnLinear = findViewById(R.id.btnLinearLayaout)
        btnTable = findViewById(R.id.btnTableLayaout)
        btnRelative = findViewById(R.id.btnRelativeLayaout)
        btnGrid= findViewById(R.id.btnGridLayaout)


        // Les damos la accion a los botones.
        btnLinear.setOnClickListener {
            // Primero ponemos la actividad en la que estamos y luego a la que queremos ir.
            val intent = Intent(this@MainActivity, LinearLayaout::class.java)
            startActivity(intent)
        }

        btnTable.setOnClickListener {
            val intent = Intent(this@MainActivity, TableLayaout::class.java)
            startActivity(intent)
        }

        btnRelative.setOnClickListener {
            val intent = Intent(this@MainActivity, RelativeLayoutActivity::class.java)
            startActivity(intent)
        }

        btnGrid.setOnClickListener {
            val intent = Intent(this@MainActivity, GridLayoutActivity::class.java)
            startActivity(intent)
        }
    }
}




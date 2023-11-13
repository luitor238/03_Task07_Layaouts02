package com.example.task07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button

class LinearLayaout : AppCompatActivity() {

    private lateinit var bntVolver : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layaout)

        bntVolver = findViewById(R.id.btnVolver)

        bntVolver.setOnClickListener {
            val intent = Intent(this@LinearLayaout, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

}
package com.example.task07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button

class GridLayout : AppCompatActivity() {
    private lateinit var bntVolver : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_layout)
        bntVolver = findViewById(R.id.btnVolver)

        bntVolver.setOnClickListener {
            val intent = Intent(this@GridLayout, MainActivity::class.java)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
}
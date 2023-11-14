package com.example.task07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class RelativeLayoutActivity : AppCompatActivity() {
    private lateinit var spinnerEC: Spinner //Spinner Estado Civil
    private lateinit var spinnerCa: Spinner //Spinner C

    private lateinit var bntVolver : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)

        setSupportActionBar(findViewById(R.id.my_toolbar))

        spinnerEC = findViewById(R.id.sp1)
        ArrayAdapter.createFromResource(this, R.array.estados, android.R.layout.simple_spinner_item).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerEC.adapter = adapter
        }

        spinnerCa = findViewById(R.id.sp2)
        ArrayAdapter.createFromResource(this, R.array.ocupacion, android.R.layout.simple_spinner_item).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerCa.adapter = adapter
        }

        bntVolver = findViewById(R.id.btnVolver)

        // Le damos la funcion al boton.
        bntVolver.setOnClickListener {
            val intent = Intent(this@RelativeLayoutActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_linearLayout -> {
                iniciarLinear()
                true
            }
            R.id.action_tableLayout -> {
                iniciarTable()
                true
            }
            R.id.action_gridLayout -> {
                iniciarGrid()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun iniciarLinear(){
        val intent = Intent(this@RelativeLayoutActivity, LinearLayaoutActivity::class.java)
        startActivity(intent)
    }
    private fun iniciarTable(){
        val intent = Intent(this@RelativeLayoutActivity, TableLayaoutActivity::class.java)
        startActivity(intent)
    }
    private fun iniciarGrid(){
        val intent = Intent(this@RelativeLayoutActivity, GridLayoutActivity::class.java)
        startActivity(intent)
    }
}
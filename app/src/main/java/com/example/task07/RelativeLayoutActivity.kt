package com.example.task07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Spinner
import android.widget.TableLayout

class RelativeLayout : AppCompatActivity() {
    private lateinit var spinnerEC: Spinner //Spinner Estado Civil
    private lateinit var spinnerCa: Spinner //Spinner C

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
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var x = false
        when (item.itemId) {
            R.id.action_linearLayout -> {
                // Primero ponemos la actividad en la que estamos y luego a la que queremos ir.
                val intent = Intent(this@RelativeLayout, LinearLayout::class.java)

                x = true
                startActivity(intent)
            }

            R.id.action_tableLayout -> {
                val intent = Intent(this@RelativeLayout, TableLayout::class.java)
                x = true
                startActivity(intent)
            }

            R.id.action_gridLayout -> {
                val intent = Intent(this@RelativeLayout, GridLayout::class.java)
                x = true
                startActivity(intent)
            }
            else -> super.onOptionsItemSelected(item)
        }
        return x
    }
}

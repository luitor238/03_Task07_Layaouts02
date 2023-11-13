package com.example.task07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.LinearLayout

class TableLayaout : AppCompatActivity() {

    // Inicializamos la variable boton.
    private lateinit var bntVolver : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_layaout)

        // Asigno la variable al boton "Volver" del activity.
        bntVolver = findViewById(R.id.btnVolver)

        // Le damos la funcion al boton.
        bntVolver.setOnClickListener {
            val intent = Intent(this@TableLayaout, MainActivity::class.java)
            startActivity(intent)
        }
    }

    // Creamos la funcion para el menu desplegable.
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var x = false
        when (item.itemId) {

            R.id.action_linearLayout -> {
                val intent = Intent(this@TableLayaout, LinearLayout::class.java)
                x = true
                startActivity(intent)
            }

            R.id.action_relativeLayout -> {
                val intent = Intent(this@TableLayaout, RelativeLayoutActivity::class.java)
                x = true
                startActivity(intent)
            }

            R.id.action_gridLayout -> {
                val intent = Intent(this@TableLayaout, GridLayoutActivity::class.java)
                x = true
                startActivity(intent)
            }
            else -> super.onOptionsItemSelected(item)
        }
        return x
    }
}
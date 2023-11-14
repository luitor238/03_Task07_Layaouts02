package com.example.task07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class TableLayaoutActivity : AppCompatActivity() {

    // Inicializamos la variable boton.
    private lateinit var bntVolver : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_layaout)

        // Asigno la variable al boton "Volver" del activity.
        bntVolver = findViewById(R.id.btnVolver)

        // Le damos la funcion al boton.
        bntVolver.setOnClickListener {
            val intent = Intent(this@TableLayaoutActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }

    // Creamos la funcion para el menu desplegable.
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
            R.id.action_relativeLayout -> {
                iniciarRelative()
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
        val intent = Intent(this@TableLayaoutActivity, LinearLayaoutActivity::class.java)
        startActivity(intent)
    }
    private fun iniciarRelative(){
        val intent = Intent(this@TableLayaoutActivity, RelativeLayoutActivity::class.java)
        startActivity(intent)
    }
    private fun iniciarGrid(){
        val intent = Intent(this@TableLayaoutActivity, GridLayoutActivity::class.java)
        startActivity(intent)
    }
}
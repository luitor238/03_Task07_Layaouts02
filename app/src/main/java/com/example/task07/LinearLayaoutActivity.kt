package com.example.task07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class LinearLayaoutActivity : AppCompatActivity() {

    // Inicializamos la variable boton.
    private lateinit var bntVolver : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layaout)

        // Asigno la variable al boton "Volver" del activity.
        bntVolver = findViewById(R.id.btnVolver)

        // Le damos la funcion al boton.
        bntVolver.setOnClickListener {
            val intent = Intent(this@LinearLayaoutActivity, MainActivity::class.java)
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
            R.id.action_tableLayout -> {
                iniciarTable()
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

    private fun iniciarTable(){
        val intent = Intent(this@LinearLayaoutActivity, TableLayaoutActivity::class.java)
        startActivity(intent)
    }

    private fun iniciarRelative(){
        val intent = Intent(this@LinearLayaoutActivity, RelativeLayoutActivity::class.java)
        startActivity(intent)
    }

    private fun iniciarGrid(){
        val intent = Intent(this@LinearLayaoutActivity, GridLayoutActivity::class.java)
        startActivity(intent)
    }

}
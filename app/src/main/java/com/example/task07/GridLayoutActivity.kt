package com.example.task07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class GridLayoutActivity : AppCompatActivity() {

    private lateinit var bntVolver : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_layout)

        bntVolver = findViewById(R.id.btnVolver)

        bntVolver.setOnClickListener {
            val intent = Intent(this@GridLayoutActivity, MainActivity::class.java)
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
            R.id.action_relativeLayout -> {
                iniciarRelative()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun iniciarLinear(){
        val intent = Intent(this@GridLayoutActivity, LinearLayaoutActivity::class.java)
        startActivity(intent)
    }
    private fun iniciarTable(){
        val intent = Intent(this@GridLayoutActivity, TableLayaoutActivity::class.java)
        startActivity(intent)
    }
    private fun iniciarRelative(){
        val intent = Intent(this@GridLayoutActivity, RelativeLayoutActivity::class.java)
        startActivity(intent)
    }
}
package com.example.task07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ArrayAdapter
import android.widget.Spinner

class RelativeLayoutActivity : AppCompatActivity() {
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
        menuInflater.inflate(R.menu.menu_relative_layout, menu)
        return true
    }

    /*

    //****ESTO HAY QUE PONERLO UNA VEZ ESTEN TODOAS LAS ACTIVITIES CREADAS****//

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var x = false
        when (item.itemId) {
            R.id.action_linearLayout -> {
                val intent = Intent(this@RelativeLayoutActivity, LinearLayout::class.java) // primero va la actividad en la que estes y luego a la que quieres ir
                x = true
                startActivity(intent)
            }
            R.id.action_tableLayout -> {
                val intent = Intent(this@RelativeLayoutActivity, tableLayout::class.java)
                x = true
                startActivity(intent)
            }
            R.id.action_gridLayout -> {
                val intent = Intent(this@RelativeLayoutActivity, gridLayout::class.java)
                x = true
                startActivity(intent)
            }
            else -> super.onOptionsItemSelected(item)
        }
        return x
    }

    */

}

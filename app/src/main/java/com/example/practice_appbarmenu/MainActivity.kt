package com.example.practice_appbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.item_add_contact -> Toast.makeText(this, "You clicked \"add contact\"", Toast.LENGTH_SHORT).show()
            R.id.item_favorites -> Toast.makeText(this, "You clicked \"favorites\"", Toast.LENGTH_SHORT).show()
            R.id.item_settings -> Toast.makeText(this, "You clicked \"settings\"", Toast.LENGTH_SHORT).show()
            R.id.item_feedback -> Toast.makeText(this, "You clicked \"feedback\"", Toast.LENGTH_SHORT).show()
            R.id.item_close -> finish()
        }
        return true
    }
}
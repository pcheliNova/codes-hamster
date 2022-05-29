package com.example.apptoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Main Activity"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            android.R.id.home -> finish()
            R.id.menu -> {
                Toast.makeText(this, "MENU", Toast.LENGTH_SHORT).show()
            }
            R.id.download -> {
                Toast.makeText(this, "DOWNLOAD", Toast.LENGTH_SHORT).show()
            }
            R.id.reboot -> {
                Toast.makeText(this, "REBOOT", Toast.LENGTH_SHORT).show()
            }
            R.id.info -> {
                Toast.makeText(this, "INFO", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}
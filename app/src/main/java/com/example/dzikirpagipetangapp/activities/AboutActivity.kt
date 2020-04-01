package com.example.dzikirpagipetangapp.activities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.dzikirpagipetangapp.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class AboutActivity : AppCompatActivity(){

    private lateinit var aboutText: TextView
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                val intent = Intent(this, MainActivity::class.java)
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
//
                val intent = Intent(this, DzikirListActivity::class.java)
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
//
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        navView.menu.getItem(2).isChecked = true

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener) // set nav_view

    }

    override fun onBackPressed() {
        val intent = Intent(this, DzikirListActivity::class.java)
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent)
        super.onBackPressed()
    }
}

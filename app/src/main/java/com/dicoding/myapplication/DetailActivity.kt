package com.dicoding.myapplication

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imageView: ImageView = findViewById(R.id.detail_image)
        val titleView: TextView = findViewById(R.id.detail_name)
        val deskripsi: TextView = findViewById(R.id.detail_deskripsi)
        val descriptionView: TextView = findViewById(R.id.detail_description)

        // Setup toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Enable back button in the toolbar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)  // Enable the back button
        supportActionBar?.setDisplayShowHomeEnabled(true)  // Ensure the home button is shown


        // Ambil data dari intent
        val title = intent.getStringExtra("EXTRA_TITLE")
        val imageResId = intent.getIntExtra("EXTRA_IMAGE", 0)
        val description = intent.getStringExtra("EXTRA_DESCRIPTION")

        // Set data ke layout
        titleView.text = title
        imageView.setImageResource(imageResId)
        descriptionView.text = description

        // Handle navigation back
        toolbar.setNavigationOnClickListener {
            finish()  // Close the activity and go back
        }
    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when (item.itemId) {
//            android.R.id.home -> {
//                finish() // Close the activity when back button is pressed
//                true
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
//    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
}

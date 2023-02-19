package com.example.projectukl

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.bottomnavigation.BottomNavigationView

class MenuActivity : AppCompatActivity() {

    private var rv_makanan: RecyclerView? = null
    val list: ArrayList<Makanan> = arrayListOf()
    var gambar: Drawable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val backButton: ImageView = findViewById(R.id.btn_back)
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.selectedItemId = R.id.pesan
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.pesan -> {
                    true
                }
                else -> false
            }
        }
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        rv_makanan = findViewById(R.id.rv_menu)
        rv_makanan?.setHasFixedSize(true)
        gambar = resources.getDrawable(R.drawable.img_coffee_1)

        list.addAll(MakananData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rv_makanan?.layoutManager = GridLayoutManager(this, 2)
        val GridMakananAdapter = GridMakananAdapter (list)
        rv_makanan?.adapter = GridMakananAdapter
    }
}
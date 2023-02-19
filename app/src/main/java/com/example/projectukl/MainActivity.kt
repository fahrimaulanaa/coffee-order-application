package com.example.projectukl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private var rvMakanan: RecyclerView? = null
    private var list: ArrayList<Makanan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    true
                }
                R.id.pesan -> {
                    val intent = Intent(this, MenuActivity::class.java)
                    startActivity(intent)
                    true
//                }
//                R.id.settings -> {
//                    startActivity<OrderActivity>()
//                    true
//                }
//                R.id.cart -> {
//                    startActivity<ProfileActivity>()
//                    true
                }
                else -> false
            }
        }
    }
}
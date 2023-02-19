package com.example.projectukl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    var nama: String? = null
    var harga: String? = null
    var gambar: String? = null
    var btnBack: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        nama = intent.getStringExtra("nama")
        harga = intent.getStringExtra("harga")
        btnBack = findViewById(R.id.btn_back)
        btnBack?.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        val tvNama: TextView = findViewById(R.id.judul_detail)
        val tvHarga: TextView = findViewById(R.id.tv_harga)

        tvNama.text = nama
        tvHarga.text = harga

    }
}
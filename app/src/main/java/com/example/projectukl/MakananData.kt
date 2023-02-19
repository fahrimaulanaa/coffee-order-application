package com.example.projectukl

import android.graphics.drawable.Drawable

object MakananData {
    private val data = arrayOf(
        arrayOf(
            "Kopi Hitam Mbeluk Asli Malang",
            "Rp. 8000",
            "https://bit.ly/411d6Ri"
        ),
        arrayOf(
            "Cold Brew Mantap Asli Malang",
            "Rp. 12.000",
            "https://bit.ly/3Sj5Axr"
        ),
        arrayOf(
            "Kopi Hitam Seduh Asli Toraja",
            "Rp. 8000",
            "https://bit.ly/3KgtsQ6"
        ),
        arrayOf(
            "Kopi Hitam Mantap Asli Papua",
            "Rp. 11.000",
            "https://bit.ly/40ZxZMF"
        ),
        arrayOf(
            "Kopi Semangat Pagi Asli Blitar",
            "Rp. 8000",
            "https://bit.ly/3Eeh6UF"
        ),
        arrayOf(
            "Kopi Hitam Paket Sarapan Pagi",
            "Rp 19.500",
            "https://bit.ly/416mm6D"
        )
    )

    val listData: ArrayList<Makanan>
    get() {
            val list = arrayListOf<Makanan>()
            for (aData in data) {
                val makanan = Makanan()
                makanan.nama = aData[0] as String
                makanan.harga = aData[1] as String
                makanan.gambar = aData[2] as String
                list.add(makanan)
            }
            return list
    }
}
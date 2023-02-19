package com.example.projectukl

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.projectukl.R

class GridMakananAdapter(private val listMakanan: ArrayList<Makanan>) : RecyclerView.Adapter<GridMakananAdapter.GridViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_grid_menu, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {

        Glide.with(holder.itemView.context)
            .load(listMakanan[position].gambar)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.imgPhoto.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Kamu memilih " + listMakanan[holder.adapterPosition].nama, Toast.LENGTH_SHORT).show()
            val Intent = Intent(holder.itemView.context, DetailActivity::class.java)
            Intent.putExtra("nama", listMakanan[holder.adapterPosition].nama)
            Intent.putExtra("harga", listMakanan[holder.adapterPosition].harga)
            holder.itemView.context.startActivity(Intent)
        }
    }

    override fun getItemCount(): Int {
        return listMakanan.size
    }

    fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}
package com.praktek.recyclerview_practice

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import java.util.zip.Inflater

class ViewHolderGrid(inflater: LayoutInflater, parent: ViewGroup):RecyclerView.ViewHolder(inflater.inflate(R.layout.grid_item, parent, false)) {
    private var imgView: ImageView? = null
    private var pJudul: TextView? = null
    private var pTahun: TextView? = null

    init {
        imgView = itemView.findViewById(R.id.image_poster)
        pJudul = itemView.findViewById(R.id.judul)
        pTahun = itemView.findViewById(R.id.tahun)
    }

    fun bind(data: poster){
        Glide.with(imgView!!.context).load(data.photo).into(imgView!!)
        pJudul?.setText(data.judul)
        pTahun?.setText(data.tahun)
    }
}
package com.praktek.recyclerview_practice

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup):
        RecyclerView.ViewHolder(inflater.inflate(R.layout.grid_item, parent , false)){

            private var imgView: ImageView? = null
            private var pJudul: TextView? = null
            private var pTahun: TextView? = null

    init {
        imgView = itemView.findViewById(R.id.image_poster)
        pJudul = itemView.findViewById(R.id.judul)
        pTahun = itemView.findViewById(R.id.tahun)
    }

    fun bind(data: poster){
        imgView?.setImageResource(data.photo!!)
        pJudul?.setText(data.judul)
        pTahun?.setText(data.tahun)
    }
}
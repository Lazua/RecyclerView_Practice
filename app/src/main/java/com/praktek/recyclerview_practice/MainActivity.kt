package com.praktek.recyclerview_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var poster: RecyclerView
    private lateinit var adapterGrid: ListAdapterGrid

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        poster = findViewById(R.id.recycler_view)

        var data = ArrayList<poster>()
        data.addAll(posterData().listPoster)

        adapterGrid = ListAdapterGrid(data)

        poster.layoutManager = GridLayoutManager(this, 2)
        poster.adapter = adapterGrid
    }
}
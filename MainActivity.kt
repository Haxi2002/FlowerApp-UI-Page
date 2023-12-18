package com.example.flowerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val img = arrayOf(R.drawable.flowerbouquet,R.drawable.cactus,R.drawable.plants,
        R.drawable.seeds, R.drawable.garden)

    private val texts = arrayOf("Bouquet","Cactus","Plants","Seeds","Gardening Tools")
    private val desc = arrayOf("Many Type of Bouquet","MultiSize&Type","Many Type of plants","Seeds for planting","Gardening Tools for planting&care")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycaler_view)
        recyclerView.layoutManager = LinearLayoutManager( this)
        recyclerView.adapter = CustomAdapter(img , texts , desc)
    }
}
package com.example.mywishlist

import android.app.Application
import com.example.mywishlist.data.Graph

class WishListApp: Application() {
    override fun onCreate(){
        super.onCreate()
        Graph.provide(this)
    }
}
package com.example.mywishlist.data

import android.content.Context
import androidx.room.Room
import com.example.mywishlist.WishDatabase


object Graph {
        lateinit var database: WishDatabase

        val wishRepository by lazy { WishRepository(wishDao = database.WishDao()) }

    fun provide(context: Context){
        database = Room.databaseBuilder(context, WishDatabase::class.java,"wishList,db").build()
    }


}
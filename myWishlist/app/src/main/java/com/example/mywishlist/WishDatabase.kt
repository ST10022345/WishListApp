package com.example.mywishlist

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mywishlist.data.Wish

@Database(
    entities = [Wish::class],
    version = 1,
    exportSchema = false
)
abstract class WishDatabase : RoomDatabase() {
    abstract fun WishDao(): WishDao
}
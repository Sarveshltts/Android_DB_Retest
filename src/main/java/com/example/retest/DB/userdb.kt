package com.example.retest.DB

import android.content.Entity
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.retest.DAO.logindao
import com.example.retest.Model.LoginEnt

@Database(entities = [LoginEnt::class],version = 1)
abstract class userdb: RoomDatabase()
{
    abstract fun getdao(): logindao
}
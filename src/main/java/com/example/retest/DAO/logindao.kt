package com.example.retest.DAO

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.RoomDatabase
import com.example.retest.Model.LoginEnt

@Dao
interface logindao {
    @Insert()
    fun insData(log:LoginEnt)
    @Query("SELECT * FROM login WHERE email==:un AND password==:pass")
    fun valuser(un:String,pass:String):List<LoginEnt>
    @Query("SELECT * FROM login")
    fun show(log: LoginEnt):List<LoginEnt>
}
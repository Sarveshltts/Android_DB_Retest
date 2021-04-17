package com.example.retest.DBbuild

import android.content.Context
import androidx.room.Room

import com.example.retest.DB.userdb

object dbbuilder {
    private var inst:userdb?=null
    fun getins(context: Context):userdb
    {
        if(inst==null)
        {
            synchronized(userdb::class)
            {
                inst=buildRoomDB(context)
            }
        }
        return inst!!
    }
    private fun buildRoomDB(context: Context) =
        Room.databaseBuilder(context.applicationContext,userdb::class.java,"mydb").build()

}

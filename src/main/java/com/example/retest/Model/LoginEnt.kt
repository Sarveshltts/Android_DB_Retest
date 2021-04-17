package com.example.retest.Model

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "login")
data class LoginEnt(@PrimaryKey @NonNull @ColumnInfo(name = "email") val email: String,
                    @ColumnInfo(name = "password") val pass: String?,
                    @ColumnInfo(name = "phone") val number: String?)

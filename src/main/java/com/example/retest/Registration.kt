package com.example.retest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.room.Room
import com.example.retest.DB.userdb
import com.example.retest.DBbuild.dbbuilder

import com.example.retest.Model.LoginEnt
import kotlinx.android.synthetic.main.activity_registration.*

class Registration : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        val db = dbbuilder.getins(applicationContext)
        buttRegister.setOnClickListener {
            var un=etRegEmail.text.toString()
            var pw=etRegPass.text.toString()
            var ph=etRegPhone.text.toString()

            db.getdao().insData(LoginEnt(un,pw,ph))

                Toast.makeText(this,"You are Registered",Toast.LENGTH_LONG).show()
                startActivity(Intent(this,MainActivity::class.java))

        }
    }
}
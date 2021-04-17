package com.example.retest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.room.Room
import com.example.retest.DB.userdb
import com.example.retest.DBbuild.dbbuilder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttLogin.setOnClickListener {
            val db = dbbuilder.getins(applicationContext)
            var user=etLogUser.text.toString()
            var pass=etLogPass.text.toString()

            var lis=db.getdao().valuser(user,pass)
            if(lis.size>0)
            {
                Toast.makeText(this,"You are Inside", Toast.LENGTH_LONG).show()
            }
            else
                Toast.makeText(this,"You are not logged in",Toast.LENGTH_LONG).show()
        }

    }
}
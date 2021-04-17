package com.example.retest

import android.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.retest.Model.LoginEnt


class MyAdapter(var userlist: ArrayList<LoginEnt>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    var myDataLists: List<LoginEnt>? = null

    fun MyAdapter(myDataLists: List<LoginEnt>?) {
        this.myDataLists = myDataLists
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.activity_list_item, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        val md: LoginEnt = myDataLists!![i]

        //  viewHolder.txtid.setText(md.getId());
        viewHolder.txtemail.setText(md.email)
        viewHolder.txtpass.setText(md.pass)
        viewHolder.txtnumber.setText(md.number)
    }

    override fun getItemCount(): Int {
        return myDataLists!!.size
    }

   inner class ViewHolder() : RecyclerView.ViewHolder() {
        private val txtid: TextView? = null
        val txtemail: TextView
        val txtpass: TextView
        val txtnumber: TextView

        init {
            //txtid=(TextView)itemView.findViewById(R.id.txt_id);
            txtemail = itemView.findViewById(R.id.textview3) as TextView
            txtpass = itemView.findViewById<View>(R.id.textView4) as TextView
            txtnumber = itemView.findViewById<View>(R.id.textView5) as TextView
        }
    }
}
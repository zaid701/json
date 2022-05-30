package com.example.recycle

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter


class adapter(val C:Context, var Postlist:ArrayList<Post>) : RecyclerView.Adapter<adapter.layout11>() {

    var a:Boolean=true
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): layout11 {

            return layout11( LayoutInflater.from(C).inflate(R.layout.layout1,parent,false) )

    }

    override fun onBindViewHolder(holder: layout11, position: Int) {
        val post:Post=Postlist[position]
        holder.body.text=post.body.toString()

    }

    override fun getItemCount(): Int {
        return Postlist.size
    }
    class layout11(itemView: View) : RecyclerView.ViewHolder(itemView){

        val body:TextView=itemView.findViewById(R.id.button)
    }
    fun setPost(postlist:ArrayList<Post>){
        this.Postlist=postlist
        notifyDataSetChanged()
    }
}

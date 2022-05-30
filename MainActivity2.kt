package com.example.recycle.withoutretro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.recycle.R
import com.google.gson.JsonObject

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val requestQueue:RequestQueue=Volley.newRequestQueue(this)
        val jsonObjectRequest:JsonObjectRequest= JsonObjectRequest(Request.Method.GET,"https://jsonplaceholder.typicode.com/todos/1",null,
        Response.Listener {
                          Toast.makeText(this,it.getString("title").toString(),Toast.LENGTH_SHORT).show()
        }, Response.ErrorListener {

            })
        requestQueue.add(jsonObjectRequest)

    }
}
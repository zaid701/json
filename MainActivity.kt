package com.example.recycle
import com.example.recycle.adapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.Toast
import androidx.compose.runtime.sourceInformationMarkerEnd
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    lateinit var a:adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        a=adapter(this, ArrayList())
        recyclerView.adapter=a
        val v=viewfactory(postreposetory())
        val postviewmodel:viewmodel=ViewModelProvider(this,v)[viewmodel::class.java]
        postviewmodel.getpost()
        postviewmodel.responselivedats.observe(this, Observer {
            a.setPost(it as ArrayList<Post>)
            progressBar.visibility=View.GONE
            recyclerView.visibility=View.VISIBLE
        })



    }

}
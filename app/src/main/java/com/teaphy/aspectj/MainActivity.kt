package com.teaphy.aspectj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_hello.setOnClickListener {
            helloAspect()
        }
    }

    public fun helloAspect() {
        Toast.makeText(this, "Hello Aspect!", Toast.LENGTH_SHORT).show()
        Log.e("teaphy", "helloAspect")
    }
}

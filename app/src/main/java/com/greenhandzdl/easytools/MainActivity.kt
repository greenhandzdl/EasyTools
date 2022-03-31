package com.greenhandzdl.easytools

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity)
        mabutton.setOnClickListener{
            Toast.makeText(this,"Hello World",Toast.LENGTH_SHORT).show()
        }
    }
}
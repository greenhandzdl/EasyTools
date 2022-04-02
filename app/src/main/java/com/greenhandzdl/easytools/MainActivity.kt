package com.greenhandzdl.easytools

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.mainactivity.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity)
        buttonfma.setOnClickListener{
            Toast.makeText(this,"Hello World",Toast.LENGTH_SHORT).show()
        }
    }
}
package com.greenhandzdl.easytools

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.main_activity.*

class mainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        Log.d(this.toString(),"Normal")
        buttonArithmeticCalculator.setOnClickListener{
            val bcintent  = Intent(this, arithmeticCalculator::class.java)
            startActivity(bcintent)
        }
        buttonMore.setOnClickListener{
            Toast.makeText(this,"Welcome!It's my first application.And The New Version:Nerve Gonna Give You Up",Toast.LENGTH_LONG).show()
            val bmintent = Intent(Intent.ACTION_VIEW)
            bmintent.data = Uri.parse("https://www.bilibili.com/video/BV1GJ411x7h7?spm_id_from=333.337.search-card.all.click")
            startActivity(bmintent)
        }

    }
}
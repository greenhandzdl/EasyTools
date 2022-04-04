package com.greenhandzdl.easytools

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.main_activity.*


class mainActivity : AppCompatActivity(){
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
    override fun onCreateOptionsMenu(menu: Menu?):Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    fun exit(){
        Toast.makeText(this,"You're exit!",Toast.LENGTH_SHORT).show()
        System.exit(1)
        System.gc()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.exit ->
                exit()
        }
        return super.onOptionsItemSelected(item)
    }
}

package com.greenhandzdl.easytools

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.mainactivity.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity)
        buttonfma.setOnClickListener{
            Toast.makeText(this,"Congratulations!It's my first version." +
                    "Nerve Gonna Give You Up",Toast.LENGTH_SHORT).show()
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.bilibili.com/video/BV1GJ411x7h7?spm_id_from=333.337.search-card.all.click")
            startActivity(intent)
        }
    }
}
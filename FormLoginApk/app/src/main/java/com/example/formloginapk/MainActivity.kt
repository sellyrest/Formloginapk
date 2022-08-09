package com.example.formloginapk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.formloginapk.R
import android.content.Intent
import android.view.View
import android.widget.Button
import com.example.formloginapk.MainActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tombol = findViewById<Button>(R.id.tombol)
        tombol.setOnClickListener(this as View.OnClickListener)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.tombol -> {
                val pindahIntent = Intent(this@MainActivity, page2activity::class.java)
                startActivity(pindahIntent)
            }
        }
    }
}
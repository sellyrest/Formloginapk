package com.example.formloginapk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.formloginapk.R
import android.content.Intent
import android.view.View
import android.widget.Button
import com.example.formloginapk.MainActivity

class page2activity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2activity)
        val tombol2 = findViewById<Button>(R.id.tombol2)
        tombol2.setOnClickListener(this as View.OnClickListener)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tombol2 -> {
                val pindahIntent = Intent(this@page2activity, MainActivity::class.java)
                startActivity(pindahIntent)
            }
        }
    }
}
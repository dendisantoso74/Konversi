package com.example.konversi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.buttonSuhu)


        btnIntent.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.buttonSuhu -> run {
                val intentsuhu = Intent(this@MainActivity,KonversiSuhu::class.java)
                startActivity(intentsuhu)
            }
        }

    }

}
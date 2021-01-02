package com.example.konversi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnIntent: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonSuhu = findViewById<Button>(R.id.buttonSuhu)
        buttonSuhu.setOnClickListener( View.OnClickListener {
            var intent = Intent (this,KonversiSuhu::class.java)
            startActivity(intent);
        })

        var buttonPanjang = findViewById<Button>(R.id.buttonPanjang)
        buttonPanjang.setOnClickListener( View.OnClickListener {
            var intent = Intent (this,KonversiPanjang::class.java)
            startActivity(intent);
        })

        var buttonKecepatan = findViewById<Button>(R.id.buttonKecepatan)
        buttonKecepatan.setOnClickListener( View.OnClickListener {
            var intent = Intent (this,KonversiKecepatan::class.java)
            startActivity(intent);
        })

        var buttonArea = findViewById<Button>(R.id.buttonArea)
        buttonArea.setOnClickListener( View.OnClickListener {
            var intent = Intent (this,KonversiArea::class.java)
            startActivity(intent);
        })
    }




}
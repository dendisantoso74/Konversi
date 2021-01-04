package com.example.konversi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class KonversiPanjang : AppCompatActivity() {

    var kilometer: EditText? = null
    var meter: EditText? = null
    var centimeter: EditText? = null
    var milimeter: EditText? = null
    var btn_konversi: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi_panjang)

        kilometer = findViewById<View>(R.id.edtxt_kilometer) as EditText
        meter = findViewById<View>(R.id.edtxt_meter) as EditText
        centimeter = findViewById<View>(R.id.edtxt_centimeter) as EditText
        milimeter = findViewById<View>(R.id.edtxt_milimeter) as EditText
        btn_konversi = findViewById<View>(R.id.btn_konvert) as Button
    }

    fun konversipanjang(view: View?) {
        try {
            val nmeter = meter!!.text.toString().toFloat()
            val nkilometer = nmeter / 1000.0f
            val ncentimeter = nmeter * 100.0f
            val nmilimeter = nmeter * 1000.0f
            kilometer!!.setText(nkilometer.toString())
            centimeter!!.setText(ncentimeter.toString())
            milimeter!!.setText(nmilimeter.toString())
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun keluar(view: View?) {
        finish()
    }
}
package com.example.konversi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class KonversiKecepatan : AppCompatActivity() {

    var kilometerperjam: EditText? = null
    var kilometerperdetik: EditText? = null
    var meterperdetik: EditText? = null
    var milperjam: EditText? = null
    var btn_konversi: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi_kecepatan)

        kilometerperjam = findViewById<View>(R.id.edtxt_kilometerperjam) as EditText
        kilometerperdetik = findViewById<View>(R.id.edtxt_kilometerperdetik) as EditText
        meterperdetik = findViewById<View>(R.id.edtxt_meterperdetik) as EditText
        milperjam = findViewById<View>(R.id.edtxt_milperjam) as EditText
        btn_konversi = findViewById<View>(R.id.btn_konvert) as Button
    }

    fun konversikecepatan(view: View?) {
        try {
            val nkiloperjam = kilometerperjam!!.text.toString().toDouble()
            val nkiloperdetik = nkiloperjam / 3600.0
            val nmeterperdetik = nkiloperjam / 3.6
            val nmilperjam = nkiloperjam / 1.609344
            kilometerperdetik!!.setText(nkiloperdetik.toString())
            meterperdetik!!.setText(nmeterperdetik.toString())
            milperjam!!.setText(nmilperjam.toString())
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun keluar(view: View?) {
        finish()
    }
}
package com.example.konversi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class KonversiArea : AppCompatActivity() {

    var meter2: EditText? = null
    var kilometer2: EditText? = null
    var centimeter2: EditText? = null
    var hektar: EditText? = null
    var btn_konversi: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi_area)

        meter2 = findViewById<View>(R.id.edtxt_meter2) as EditText
        kilometer2 = findViewById<View>(R.id.edtxt_kilometer2) as EditText
        centimeter2 = findViewById<View>(R.id.edtxt_centimeter2) as EditText
        hektar = findViewById<View>(R.id.edtxt_hektar) as EditText
        btn_konversi = findViewById<View>(R.id.btn_konvert) as Button
    }

    fun konversiarea(view: View?) {
        try {
            val nmeter2 = meter2!!.text.toString().toFloat()
            val nkilometer2 = nmeter2 / 1000000.0f
            val ncentimeter2 = nmeter2 * 10000.0f
            val nhektar = nmeter2 / 10000.0f
            kilometer2!!.setText(nkilometer2.toString())
            centimeter2!!.setText(ncentimeter2.toString())
            hektar!!.setText(nhektar.toString())
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun keluar(view: View?) {
        finish()
    }
}
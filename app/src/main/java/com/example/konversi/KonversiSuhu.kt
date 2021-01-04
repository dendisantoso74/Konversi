package com.example.konversi

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class KonversiSuhu : AppCompatActivity() {

    var celcius: EditText? = null
    var kelvin: EditText? = null
    var farenheit: EditText? = null
    var reamur: EditText? = null
    var btn_konversi: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi_suhu)

        celcius = findViewById<View>(R.id.edtxt_celcius) as EditText
        kelvin = findViewById<View>(R.id.edtxt_kelvin) as EditText
        farenheit = findViewById<View>(R.id.edtxt_farenheit) as EditText
        reamur = findViewById<View>(R.id.edtxt_reamur) as EditText
        btn_konversi = findViewById<View>(R.id.btn_konvert) as Button
    }

    fun konversisuhu(view: View?) {
        try {
            val ncelcius = celcius!!.text.toString().toFloat()
            val nkelvin = ncelcius + 273.15f
            val nfarenheit = 1.8f*ncelcius+32f
            val nreamur = 0.8f*ncelcius
            kelvin!!.setText(nkelvin.toString())
            farenheit!!.setText(nfarenheit.toString())
            reamur!!.setText(nreamur.toString())
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun keluar(view: View?) {
        finish()
    }
}
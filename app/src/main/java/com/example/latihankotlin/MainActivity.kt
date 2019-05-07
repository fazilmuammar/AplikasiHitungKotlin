package com.example.latihankotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alas = edtAlas.text
        val tinggi = edtTinggi.text

        btnHitung.setOnClickListener {
            if (alas.isNullOrBlank()) {
                edtAlas.error = " Alas tidak boleh kosong"
                edtAlas.requestFocus();
            } else if (tinggi.isNullOrBlank()) {
                edtTinggi.error = " Tinggi tidak boleh kosong"
                edtTinggi.requestFocus()
            }


            hitungLuas(alas.toString().toInt(), tinggi.toString().toInt())
        }
    }


    fun hitungLuas(alas: Int, tinggi: Int) {
        val hasil = alas * tinggi
        txtHasil.text = hasil.toString()
        scrollView.smoothScrollBy(0, scrollView.bottom)
    }
}

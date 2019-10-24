package com.uty.gusti_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.makeText as makeText1

class MainActivityke2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityke2)

        var intent = intent
        val Nim = intent.getStringExtra("Nim")
        val Nama = intent.getStringExtra("Nama")
        val Nilai = intent.getStringExtra("Nilai")
        var keterangan = intent.getStringExtra("Keterangan")

        if (Nilai >= 80.toString()){
            keterangan = "A"
        } else if (Nilai >= 60.toString() || Nilai < 80.toString()){
            keterangan = "B"
        } else if (Nilai >= 40.toString() || Nilai < 60.toString()){
            keterangan = "C"
        } else if  (Nilai >= 20.toString() || Nilai < 40.toString()){
            keterangan = "D"
        } else {
            keterangan = "E"

        }

        val resultTv = findViewById<TextView>(R.id.Et1)
        resultTv.text =
            "\nNim : " + Nim + "\nNama : " + Nama + "\nNilai : " + Nilai + "\nKeterangan : " + keterangan
       Toast.makeText (applicationContext, Nim.toString() + Nama + Nilai, Toast.LENGTH_LONG).show()

    }
    }

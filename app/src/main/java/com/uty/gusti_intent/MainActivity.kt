package com.uty.gusti_intent

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.Toast
import android.widget.EditText as EditText1


class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Et1 = findViewById<EditText1>(R.id.Et1)
        val Et2 = findViewById<EditText1>(R.id.Et2)
        val Et3 = findViewById<EditText1>(R.id.Et3)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            if (Et1.text.isEmpty() || Et2.text.isEmpty() || Et3.text.isEmpty())
                toast("Kolom tidak boleh kosong"!!, Toast.LENGTH_LONG)
            else if (Et1.text.isNotEmpty() || Et2.text.isNotEmpty() || Et3.text.isNotEmpty()) {
                toast("Data Tersimpan", Toast.LENGTH_LONG)

                val Nim = Et1.text.toString()
                val Nama = Et2.text.toString()
                val Nilai = Et3.text.toString()

                val intent = Intent(this@MainActivity, MainActivityke2::class.java)
                intent.putExtra("Nim", Nim)
                intent.putExtra("Nama", Nama)
                intent.putExtra("Nilai", Nama)
                startActivity(intent)
            }
        }
    }

    private fun toast(message: String, length: Int = Toast.LENGTH_LONG) {
        Toast.makeText(this, message, length).show()
    }
}
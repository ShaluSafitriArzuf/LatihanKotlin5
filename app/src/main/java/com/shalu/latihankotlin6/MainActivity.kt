package com.shalu.latihankotlin6

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var btnsuhu: Button
    lateinit var btndiskon: Button
    lateinit var btnluas: Button
    lateinit var ganjil: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        btnsuhu = findViewById(R.id.btnsuhu)
        btndiskon = findViewById(R.id.btndiskon)
        btnluas = findViewById(R.id.btnluas)
        ganjil = findViewById(R.id.ganjil)

        btnsuhu.setOnClickListener() {
            val intent = Intent(this, Konferensi_suhu::class.java)
            startActivity(intent)
        }

        btndiskon.setOnClickListener() {
            val intent = Intent(this, Diskon_harga::class.java)
            startActivity(intent)
        }

        btnluas.setOnClickListener() {
            val intent = Intent(this, Luas_persegi::class.java)
            startActivity(intent)
        }

        ganjil.setOnClickListener() {
            val intent = Intent(this, Ganjil_genap::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
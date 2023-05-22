package com.example.usosugarormv4


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fabAgregar = findViewById<FloatingActionButton>(R.id.btnAgregar)

        fabAgregar.setOnClickListener {
            val intent = Intent(this, RegistroUsuarios::class.java)
            startActivity(intent)
        }
    }
}
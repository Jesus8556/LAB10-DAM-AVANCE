package com.example.usosugarormv4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro_usuarios.*

class RegistroUsuarios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_usuarios)
        btnRegistrar.setOnClickListener(){
            var nombre = txtNombre.text.toString()
            var correo = txtCorreo.text.toString()
            var clave = txtClave.text.toString()

            if(nombre.isEmpty() || correo.isEmpty() || clave.isEmpty()){
                Toast.makeText(this, "Algunos campos estan vacios",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            var usuariorepo = UsuarioRepositorio()
            usuariorepo.crear(nombre,correo,clave)

            var datoGuardado= usuariorepo.listar().size
            Toast.makeText(this, "Datos Guardados:\n"+ datoGuardado,Toast.LENGTH_LONG).show()
        }
    }
}
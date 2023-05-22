package com.example.usosugarormv4
import com.orm.SugarRecord



class UsuarioRepositorio
{
    fun crear(nombre:String,correo:String,clave:String){
        var usuario = Usuario(nombre,correo,clave)
        SugarRecord.save(usuario)
    }
    fun listar():List<Usuario>{
        var usuarios = SugarRecord.listAll(Usuario::class.java)
        return usuarios
    }
}
package com.example.usosugarormv4
import com.orm.dsl.Table
@Table
data class Usuario (
    var id: Long? = null,
    var nombre: String? = null,
    var correo: String? = null,
    var clave: String? = null){
    constructor(nombre: String?,correo: String?,clave: String?):this(){
        this.nombre=nombre
        this.correo=correo
        this.clave=clave
    }

}
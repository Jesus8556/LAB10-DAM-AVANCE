package com.example.usosugarormv4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorUsuarios (val ListaUsuarios:ArrayList<Usuario>): RecyclerView.Adapter<AdaptadorUsuarios.ViewHolder>(){
    class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView) {
        val fNombre = itemView.findViewById<TextView>(R.id.lblNombre)
        val fCorreo = itemView.findViewById<TextView>(R.id.lblCorreo)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.vista_usuario, parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.fNombre?.text= ListaUsuarios[position].nombre
        holder?.fCorreo?.text= ListaUsuarios[position].correo
    }

    override fun getItemCount(): Int {
        return ListaUsuarios.size
    }
}
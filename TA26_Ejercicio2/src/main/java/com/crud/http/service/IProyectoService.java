package com.crud.http.service;

import java.util.List;

import com.crud.http.dto.Proyecto;

public interface IProyectoService {
	//Metodos del CRUD
	public List<Proyecto> listarProyectos(); //Listar All 
	
	public Proyecto guardarProyecto(Proyecto proyecto);	//Guarda un proyecto CREATE
	
	public Proyecto proyectoXID(String id); //Leer datos de un proyecto READ
			
	public List<Proyecto> listarProyectoNombre(String nombre);//Listar Proyectos por campo nombre
			
	public Proyecto actualizarProyecto(Proyecto proyecto); //Actualiza datos del proyecto UPDATE
			
	public void eliminarProyecto(String id);// Elimina el proyecto DELETE
}

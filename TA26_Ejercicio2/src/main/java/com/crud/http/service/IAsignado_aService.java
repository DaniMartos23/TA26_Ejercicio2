package com.crud.http.service;

import java.util.List;

import com.crud.http.dto.Asignado_a;

public interface IAsignado_aService {
	//Metodos del CRUD
	public List<Asignado_a> listarAsignado_a(); //Listar All 
	
	public Asignado_a guardarAsignado_a(Asignado_a asignado_a);	//Guarda un asignado_a CREATE
	
	public Asignado_a asignado_aXID(int id); //Leer datos de un asignado_a READ
			
	
			
	public Asignado_a actualizarAsignado_a(Asignado_a asignado_a); //Actualiza datos del asignado_a UPDATE
			
	public void eliminarAsignado_a(int id);// Elimina el asignado_a DELETE
}

package com.crud.http.service;

import java.util.List;

import com.crud.http.dto.Cientifico;

public interface ICientificosService {
	//Metodos del CRUD
		public List<Cientifico> listarCientificos(); //Listar All 
		
		public Cientifico guardarCientificos(Cientifico cientifico);	//Guarda un fabricante CREATE
		
		public Cientifico cientificosXDNI(String dni); //Leer datos de un fabricante READ
		
		public List<Cientifico> listarCientificosNombre(String nombre);//Listar Cientificoss por campo nombre
		
		public Cientifico actualizarCientificos(Cientifico cientifico); //Actualiza datos del fabricante UPDATE
		
		public void eliminarCientificos(String dni);// Elimina el fabricante DELETE
}

package com.crud.http.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.http.dto.Cientifico;

public interface ICientificosDAO extends JpaRepository<Cientifico, String> {
	
	//Listar fabricantes por campo nombre
		public List<Cientifico> findByNombre(String nombre);
}

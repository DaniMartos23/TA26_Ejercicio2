package com.crud.http.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.http.dto.Proyecto;

public interface IProyectoDAO extends JpaRepository<Proyecto, String> {
	//Listar articulos por campo nombre
			public List<Proyecto> findByNombre(String nombre);
}

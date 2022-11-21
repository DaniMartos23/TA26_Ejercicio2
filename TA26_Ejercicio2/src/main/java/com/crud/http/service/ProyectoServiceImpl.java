package com.crud.http.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.http.dao.IProyectoDAO;
import com.crud.http.dto.Proyecto;


@Service
public class ProyectoServiceImpl implements IProyectoService{
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IProyectoDAO iProyectosDAO;
	
	@Override
	public List<Proyecto> listarProyectos() {
		// TODO Auto-generated method stub
		return iProyectosDAO.findAll();
	}

	@Override
	public Proyecto guardarProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return iProyectosDAO.save(proyecto);
	}

	@Override
	public Proyecto proyectoXID(String id) {
		// TODO Auto-generated method stub
		return iProyectosDAO.findById(id).get();
	}

	@Override
	public List<Proyecto> listarProyectoNombre(String nombre) {
		// TODO Auto-generated method stub
		return iProyectosDAO.findByNombre(nombre);
	}

	@Override
	public Proyecto actualizarProyecto(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return iProyectosDAO.save(proyecto);
	}

	@Override
	public void eliminarProyecto(String id) {
		
		iProyectosDAO.deleteById(id);
		
	}
	
	

}

package com.crud.http.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.http.dto.Proyecto;
import com.crud.http.service.ProyectoServiceImpl;

@RestController
@RequestMapping("/api")

public class ProyectoController {

	@Autowired
	ProyectoServiceImpl proyectoServiceImpl;
	
	@GetMapping("/proyectos")
	public List<Proyecto> listarProyectos(){
		return proyectoServiceImpl.listarProyectos();
	}
	
	//listar proyectos por campo nombre
	@GetMapping("/proyectos/nombre/{nombre}")
	public List<Proyecto> listarProyectoNombre(@PathVariable(name="nombre") String nombre) {
	    return proyectoServiceImpl.listarProyectoNombre(nombre);
	}
	
	
	@PostMapping("/proyectos")
	public Proyecto salvarProyecto( @RequestBody Proyecto proyecto) {
		return proyectoServiceImpl.guardarProyecto(proyecto);
	}
	
	
	@GetMapping("/proyectos/{id}")
	public Proyecto ProyectoXID(@PathVariable(name="id") String id) {
		
		Proyecto proyecto_xid= new Proyecto();
		
		proyecto_xid= proyectoServiceImpl.proyectoXID(id);
		
		System.out.println("Proyecto XID: "+proyecto_xid);
		
		return proyecto_xid;
	}
	
	@PutMapping("/proyectos/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name="id")String id, @RequestBody Proyecto proyecto) {
		
		Proyecto proyecto_seleccionado= new Proyecto();
		Proyecto proyecto_actualizado= new Proyecto();
		
		proyecto_seleccionado= proyectoServiceImpl.proyectoXID(id);
		
		proyecto_seleccionado.setNombre(proyecto.getNombre());
		proyecto_seleccionado.setHoras(proyecto.getHoras());
		proyecto_actualizado = proyectoServiceImpl.actualizarProyecto(proyecto_seleccionado);
		
		System.out.println("El Proyecto actualizado es: "+ proyecto_actualizado);
		
		return proyecto_actualizado;
	}
	
	@DeleteMapping("/proyectos/{id}")
	public void eliminarProyecto(@PathVariable(name="id")String id) {
		proyectoServiceImpl.eliminarProyecto(id);
	}
}

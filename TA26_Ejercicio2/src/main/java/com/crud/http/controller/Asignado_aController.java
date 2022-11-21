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

import com.crud.http.dto.Asignado_a;
import com.crud.http.service.Asignado_aServiceImpl;

@RestController
@RequestMapping("/api")

public class Asignado_aController {

	@Autowired
	Asignado_aServiceImpl asignado_aServiceImpl;
	
	@GetMapping("/asignado_a")
	public List<Asignado_a> listarAsignado_as(){
		return asignado_aServiceImpl.listarAsignado_a();
	}
	
	
	
	
	@PostMapping("/asignado_a")
	public Asignado_a salvarAsignado_a( @RequestBody Asignado_a asignado_a) {
		return asignado_aServiceImpl.guardarAsignado_a(asignado_a);
	}
	
	
	@GetMapping("/asignado_a/{codigo}")
	public Asignado_a Asignado_aXID(@PathVariable(name="codigo") int id) {
		
		Asignado_a asignado_a_xid= new Asignado_a();
		
		asignado_a_xid= asignado_aServiceImpl.asignado_aXID(id);
		
		System.out.println("Asignado_a XID: "+asignado_a_xid);
		
		return asignado_a_xid;
	}
	
	@PutMapping("/asignado_a/{codigo}")
	public Asignado_a actualizarAsignado_a(@PathVariable(name="codigo")int id, @RequestBody Asignado_a asignado_a) {
		
		Asignado_a asignado_a_seleccionado= new Asignado_a();
		Asignado_a asignado_a_actualizado= new Asignado_a();
		
		asignado_a_seleccionado= asignado_aServiceImpl.asignado_aXID(id);
		asignado_a_seleccionado.setProyectos(asignado_a.getProyectos());
		asignado_a_seleccionado.setCientificos(asignado_a.getCientificos());
		asignado_a_actualizado = asignado_aServiceImpl.actualizarAsignado_a(asignado_a_seleccionado);
		
		System.out.println("El Asignado_a actualizado es: "+ asignado_a_actualizado);
		
		return asignado_a_actualizado;
	}
	
	@DeleteMapping("/asignado_a/{codigo}")
	public void eliminarAsignado_a(@PathVariable(name="codigo")int id) {
		asignado_aServiceImpl.eliminarAsignado_a(id);
	}
}

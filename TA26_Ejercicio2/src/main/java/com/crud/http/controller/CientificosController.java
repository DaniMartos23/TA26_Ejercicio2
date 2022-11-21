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

import com.crud.http.dto.Cientifico;
import com.crud.http.service.CientificosServiceImpl;


@RestController
@RequestMapping("/api")

public class CientificosController {
	@Autowired
	CientificosServiceImpl cientificosServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listarCientificos(){
		return cientificosServiceImpl.listarCientificos();
	}
	
	//listar cientificoss por campo nombre
	@GetMapping("/cientificos/nombre/{nombre}")
	public List<Cientifico> listarCientificosNombre(@PathVariable(name="nombre") String nombre) {
	    return cientificosServiceImpl.listarCientificosNombre(nombre);
	}
	
	
	@PostMapping("/cientificos")
	public Cientifico salvarCientificos(@RequestBody Cientifico cientifico) {
		return cientificosServiceImpl.guardarCientificos(cientifico);
	}
	
	
	@GetMapping("/cientificos/{dni}")
	public Cientifico CientificosXID(@PathVariable(name="dni") String dni) {
		
		Cientifico cientificos_xid= new Cientifico();
		
		cientificos_xid= cientificosServiceImpl.cientificosXDNI(dni);
		
		System.out.println("Cientificos XDNI: "+cientificos_xid);
		
		return cientificos_xid;
	}
	
	@PutMapping("/cientificos/{dni}")
	public Cientifico actualizarCientificos(@PathVariable(name="dni")String dni, @RequestBody Cientifico cientifico) {
		
		Cientifico cientificos_seleccionado= new Cientifico();
		Cientifico cientificos_actualizado= new Cientifico();
		
		cientificos_seleccionado= cientificosServiceImpl.cientificosXDNI(dni);
		
		cientificos_seleccionado.setNombre(cientifico.getNombre());
		
		cientificos_actualizado = cientificosServiceImpl.actualizarCientificos(cientificos_seleccionado);
		
		System.out.println("El Cientificos actualizado es: "+ cientificos_actualizado);
		
		return cientificos_actualizado;
	}
	
	@DeleteMapping("/cientificos/{dni}")
	public void eliminarCientificos(@PathVariable(name="dni")String dni) {
		cientificosServiceImpl.eliminarCientificos(dni);
	}
}

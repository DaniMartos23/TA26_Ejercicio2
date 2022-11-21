package com.crud.http.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.http.dao.ICientificosDAO;
import com.crud.http.dto.Cientifico;



@Service
public class CientificosServiceImpl implements ICientificosService {

	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	ICientificosDAO iCientificosDAO;
		
	@Override
	public List<Cientifico> listarCientificos() {
		// TODO Auto-generated method stub
		return iCientificosDAO.findAll();
	}

	@Override
	public Cientifico guardarCientificos(Cientifico cientifico) {
		// TODO Auto-generated method stub
		return iCientificosDAO.save(cientifico);
	}

	@Override
	public Cientifico cientificosXDNI(String dni) {
		// TODO Auto-generated method stub
		return iCientificosDAO.findById(dni).get();
	}

	@Override
	public List<Cientifico> listarCientificosNombre(String nombre) {
		// TODO Auto-generated method stub
		return iCientificosDAO.findByNombre(nombre);
	}

	@Override
	public Cientifico actualizarCientificos(Cientifico cientifico) {
		// TODO Auto-generated method stub
		return iCientificosDAO.save(cientifico);
	}

	@Override
	public void eliminarCientificos(String dni) {
		// TODO Auto-generated method stub
		iCientificosDAO.deleteById(dni);
	}

}

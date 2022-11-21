package com.crud.http.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.http.dao.IAsignado_aDAO;
import com.crud.http.dto.Asignado_a;


@Service
public class Asignado_aServiceImpl implements IAsignado_aService{
	
	@Autowired
	IAsignado_aDAO iAsignado_asDAO;
	
	@Override
	public List<Asignado_a> listarAsignado_a() {
		// TODO Auto-generated method stub
		return iAsignado_asDAO.findAll();
	}

	@Override
	public Asignado_a guardarAsignado_a(Asignado_a asignado_a) {
		// TODO Auto-generated method stub
		return iAsignado_asDAO.save(asignado_a);
	}

	@Override
	public Asignado_a asignado_aXID(int id) {
		// TODO Auto-generated method stub
		return iAsignado_asDAO.findById(id).get();
	}

	

	@Override
	public Asignado_a actualizarAsignado_a(Asignado_a asignado_a) {
		// TODO Auto-generated method stub
		return iAsignado_asDAO.save(asignado_a);
	}

	@Override
	public void eliminarAsignado_a(int id) {
		
		iAsignado_asDAO.deleteById(id);
		
	}
	
	

}

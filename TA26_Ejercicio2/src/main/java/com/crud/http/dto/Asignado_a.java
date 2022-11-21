package com.crud.http.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="asignado_a")//en caso que la tabala sea diferente
public class Asignado_a {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "proyecto")
	Proyecto proyectos;
	
	@ManyToOne
    @JoinColumn(name = "cientifico")
	Cientifico cientifico;
	



	public Asignado_a() {
		
	}


	public Asignado_a(int id, Proyecto proyectos, Cientifico cientifico) {
		super();
		this.id = id;
		this.proyectos = proyectos;
		this.cientifico = cientifico;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Proyecto getProyectos() {
		return proyectos;
	}


	public void setProyectos(Proyecto proyectos) {
		this.proyectos = proyectos;
	}


	public Cientifico getCientificos() {
		return cientifico;
	}


	public void setCientificos(Cientifico cientifico) {
		this.cientifico = cientifico;
	}


	@Override
	public String toString() {
		return "Suministra [id=" + id + ", piezas=" + proyectos + ", proveedores=" + cientifico +  "]";
	}


	
	
	
	
	
	
}

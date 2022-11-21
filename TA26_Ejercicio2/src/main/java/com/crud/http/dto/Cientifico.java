package com.crud.http.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="cientificos")//en caso que la tabala sea diferente
public class Cientifico {
	
	@Id
	@Column(name="dni")
	private String dni;
	@Column(name = "nomapels")
	private String nombre;

	@OneToMany
    @JoinColumn(name="cientifico")
    private List<Asignado_a> asignado_a;
	
	public Cientifico() {
		
	}
	
	public Cientifico(String dni, String nombre,List<Asignado_a> asignado_a) {
		//super();
		this.dni = dni;
		this.nombre = nombre;
		this.asignado_a= asignado_a;
	}

	/**
	 * @return dni
	 */
	
	public String getDni() {
		return dni;
	}
	
	/**
	 * 
	 * @param dni
	 */

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * @return nombre
	 */

	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	/**
	 * 
	 * @return suministra
	 */
	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cientificos")
	public List<Asignado_a> getSuministra() {
		return asignado_a;
	}
	
	/**
	 * 
	 * @param asignado_a
	 */
	
	public void setSuministra(List<Asignado_a> asignado_a) {
		this.asignado_a = asignado_a;
	}

	@Override
	public String toString() {
		return "Cientifico [dni=" + dni + ", nomapels=" + nombre +  "]";
	}
	
	
	
}

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
@Table(name="proyectos")//en caso que la tabala sea diferente
public class Proyecto {

	
	@Id
	
	private String id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "horas")
	private int horas;
	
	@OneToMany()
    @JoinColumn(name = "proyecto")
    List<Asignado_a> asignado_a;
	
	public Proyecto() {
		
	}
	
	
	
	public Proyecto(String id, String nombre,int horas, List<Asignado_a> asignado_a) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.horas=horas;
		this.asignado_a = asignado_a;
	}





	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getHoras() {
		return horas;
	}



	public void setHoras(int horas) {
		this.horas = horas;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "proyectos")
	public List<Asignado_a> getSuministra() {
		return asignado_a;
	}
	
	
	public void setSuministra(List<Asignado_a> asignado_a) {
		this.asignado_a = asignado_a;
	}



	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", nombre=" + nombre +", horas="+horas+"]";
	}

	
	
}

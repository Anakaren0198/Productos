package com.mx.Productos.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "Productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Productos {

	// Mapear los campos de la tabla
	@Id // Siempre se coloca ---- para indicar que tendremos nuestra llave primaria
	@Column(name = "ID")
	private Long idP;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "PRECIO")
	private Date precio;
	@Column(name = "TIPO")
	private String tipo;
	@Column(name = "CADUCIDAD")
	private String caducidad;
	@Column(name = "EXISTENCIA")
	private String existencia;
	
	
	/*
	 * CREATE TABLE POKEMON( ID NUMBER PRIMARY KEY, NOMBRE VARCHAR2(80) NOT NULL,
	 * GENERACION DATE NOT NULL, COLOR VARCHAR2(70), EVOLUCION VARCHAR2(80) );
	 */
	
	

	public Productos() {

	}

	public Productos(Long idP, String nombre, Date precio, String tipo, String caducidad, String existencia) {
		super();
		this.idP = idP;
		this.nombre = nombre;
		this.precio = precio;
		this.tipo = tipo;
		this.caducidad = caducidad;
		this.existencia = existencia;
	}

	@Override
	public String toString() {
		return "Productos [idP=" + idP + ", nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + ", caducidad="
				+ caducidad + ", existencia=" + existencia + "]";
	}

	public Long getIdP() {
		return idP;
	}

	public void setIdP(Long idP) {
		this.idP = idP;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getPrecio() {
		return precio;
	}

	public void setPrecio(Date precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(String caducidad) {
		this.caducidad = caducidad;
	}

	public String getExistencia() {
		return existencia;
	}

	public void setExistencia(String existencia) {
		this.existencia = existencia;
	}

}

package com.mx.Productos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Productos.model.Productos;



public interface Productosdao extends JpaRepository<Productos, Long> {

	
	
	// Metodo que se ejecuta bajo el resorte del repositorio
	public Productos findByNombre(String nombre);
}



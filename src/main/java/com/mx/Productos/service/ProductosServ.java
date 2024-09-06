package com.mx.Productos.service;

import java.util.List;

import com.mx.Productos.model.Productos;


public interface ProductosServ {
	public List<Productos> listar();

	public void guardar(Productos productos);

	public Productos buscar(Long idP);

	public void editar(Productos productos);

	public void eliminar(Long idP);

	public Productos buscarXNombre(String nombre);

}


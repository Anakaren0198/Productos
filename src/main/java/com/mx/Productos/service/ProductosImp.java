package com.mx.Productos.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.Productos.dao.Productosdao;
import com.mx.Productos.model.Productos;





//Le indicamos que vamos a realizar un servicio
@Service


public class ProductosImp implements ProductosServ {

	@Autowired
	Productosdao dao;

	@Transactional(readOnly = true)
	
	
	@Override
	public List<Productos> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Transactional
	@Override
	public void guardar(Productos productos) {
		// TODO Auto-generated method stub
		dao.save(productos);
	}
	@Transactional(readOnly = true)
	@Override
	public Productos buscar(Long idP) {
		// TODO Auto-generated method stub
		return dao.findById(idP).orElse(null);
	}
	@Transactional
	@Override
	public void editar(Productos productos) {
		// TODO Auto-generated method stub
		dao.save(productos);
	}
	@Transactional
	@Override
	public void eliminar(Long idP) {
		// TODO Auto-generated method stub
		dao.deleteById(idP);
	}
	@Transactional(readOnly = true)
	@Override
	public Productos buscarXNombre(String nombre) {
		// TODO Auto-generated method stub
		return dao.findByNombre(nombre);
	}

}

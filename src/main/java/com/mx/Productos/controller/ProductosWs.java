package com.mx.Productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Productos.model.Productos;
import com.mx.Productos.service.ProductosImp;

//@RestController---Nos permite marcar como controlador de solicitudes y 
//se utiliza para crear servicios restfull --- web service de tipo rest --- JSON

//@RequestMapping ---Se utiliza para asingar solicitudes web a nlos entornos de spring
//para formar nuestros recursos

//@CrossOrigin---Es por la seguridad que permite restringir los recursos implementados en 
//los navegadores con esto la aplicacion es confibale o segura, para que no lo bloqueen

@RestController
@RequestMapping(path = "ProductosWs")
@CrossOrigin
public class ProductosWs {

	@Autowired
	ProductosImp imp;

	// URL peticiones utilizando el protocolo http
	// URL: urlServidorLocal + pathCalse + pathMetodo

	// Peticion get para listar los registros

	
	// http://localhost:9000/ProductosWs/listar

	@GetMapping(path = "listar")
	public List<Productos> listar() {
		return imp.listar();
	}

	// @RequestBody---convierte un Json a objeto
	// http://localhost:9000/ProductosWs/guardar
	@PostMapping(path = "guardar")
	public void guardar(@RequestBody Productos productos) {
		imp.guardar(productos);
	}
	// http://localhost:9000/ProductosWs/buscar
	/*
	 * @PostMapping(path = "buscar") public Productos buscar(@RequestBody Productos
	 * productos) { return imp.buscar(productos.getIdP()); }
	 */

	@PostMapping(path = "Buscar")
	public Productos buscar(@RequestBody Productos productos) {
		return imp.buscar(productos.getIdP());
	}

	// http://localhost:9000/ProductosWs/editar
	@PostMapping(path = "editar")
	public void editar(@RequestBody Productos productos) {
		imp.editar(productos);
	}

	// http://localhost:9000/ProductosWs/eliminar
	@PostMapping(path = "eliminar")
	public void eliminar(@RequestBody Productos productos) {
		imp.eliminar(productos.getIdP());
	}

	// http://localhost:9000/ProductosWs/buscarNombre
	@PostMapping(path ="buscarNombre")
	public Productos buscarNombre(@RequestBody Productos productos) {
		Productos productoEnc = imp.buscarXNombre(productos.getNombre());
		return productoEnc;
	}
}

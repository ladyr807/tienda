package com.tienda.tienda.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.tienda.model.Producto;
import com.tienda.tienda.service.ProductoService;

@RestController
public class ProductoController {

	ProductoService productoService;
	
	@RequestMapping(value = "/productos", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<List<Producto>> getProducts() throws Exception {
		List<Producto> productos = productoService.consultarTodosProducto();
		return new ResponseEntity<List<Producto>> (productos, HttpStatus.FOUND);
	}
	
	@RequestMapping(value = "/productos/{idProducto}", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<Producto> getBy(@PathVariable("idProducto") Long idProducto) throws Exception  {
		Producto producto = productoService.consultarProducto(idProducto);
		return new ResponseEntity<Producto> (producto, HttpStatus.OK);
	}
}

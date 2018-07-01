package com.tienda.tienda.controller;

import java.net.URI;
import java.net.URISyntaxException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tienda.tienda.model.Carrito;
import com.tienda.tienda.service.CarritoService;

public class CarritoController {

	CarritoService carritoService;

	@RequestMapping(value = "/users/{idUser}/carrito", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<Void> crear(@RequestBody Carrito carrito, HttpServletRequest request) throws URISyntaxException {
		Long id = carritoService.guardarCarrito(carrito);
		HttpHeaders header = new HttpHeaders();
		header.setLocation(new URI(request.getRequestURL() + "/" + id.toString()));
		return new ResponseEntity<Void>(header, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/users/{idUser}/carts/{idCart}", method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity<Void> addProducto(@PathVariable("idCart") Long idCarrito, @RequestParam("idProduct") Long idProducto,
			@RequestParam("cantidad") Integer cantidad) {
		carritoService.adicionarACarrito(idCarrito, idProducto, cantidad);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/venta", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<Void> venta(@PathVariable("idCart") Long idCarrito, HttpServletRequest request) throws URISyntaxException {
		Long id = carritoService.guardarVenta(idCarrito);
		HttpHeaders header = new HttpHeaders();
		header.setLocation(new URI(request.getRequestURL() + "/" + id.toString()));
		return new ResponseEntity<Void>(header, HttpStatus.CREATED);
	}
}

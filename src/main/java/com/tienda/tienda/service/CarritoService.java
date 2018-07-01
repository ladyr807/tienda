package com.tienda.tienda.service;

import com.tienda.tienda.model.Carrito;

public interface CarritoService {
	Long guardarCarrito(Carrito carrito);
	void adicionarACarrito(Long idCarrito, Long idProducto, Integer cantidad);
	Long guardarVenta(Long idCarrito);
	
}

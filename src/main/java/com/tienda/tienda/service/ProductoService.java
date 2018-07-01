package com.tienda.tienda.service;

import java.util.List;

import com.tienda.tienda.model.Producto;

public interface ProductoService {
	Producto consultarProducto(long id);
	List<Producto> consultarTodosProducto();
}

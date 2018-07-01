package com.tienda.tienda.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.tienda.tienda.model.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {

	final private static Logger log = LoggerFactory.getLogger(ProductoServiceImpl.class);
	
	@Override
	public Producto consultarProducto(long idProducto) {
		log.info("Se consultó el producto: " + idProducto);
		Producto producto = new Producto("Camisa HERO", new BigDecimal("45000"));
		return producto;
	}

	@Override
	public List<Producto> consultarTodosProducto() {
		log.info("Se consultaron todos los productos");
		List<Producto> listaProductos = new ArrayList<Producto>();
		Producto producto = new Producto("Camisa HERO", new BigDecimal("45000"));
		listaProductos.add(producto);
		producto = new Producto("Pantalón HERO", new BigDecimal("85000"));
		listaProductos.add(producto);
		producto = new Producto("Chaqueta HERO", new BigDecimal("105000"));
		listaProductos.add(producto);
		return null;
	}

}

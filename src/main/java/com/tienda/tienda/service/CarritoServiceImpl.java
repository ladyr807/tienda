package com.tienda.tienda.service;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.tienda.tienda.model.Carrito;
import com.tienda.tienda.model.Cliente;
import com.tienda.tienda.model.Item;
import com.tienda.tienda.model.Producto;

@Service
public class CarritoServiceImpl implements CarritoService {

	final private static Logger log = LoggerFactory.getLogger(CarritoServiceImpl.class);
	
	@Override
	public Long guardarCarrito(Carrito carrito) {
		log.info("Se guardó el carrito: " + carrito);
		
		return (long) Math.random();
	}

	@Override
	public void adicionarACarrito(Long idCarrito, Long idProducto, Integer cantidad) {
		log.info("Se adicionó al carrito: " + idCarrito);
		Cliente cliente =  new Cliente(12L, "Leidy Román", "CC", "1053769911");
		Carrito carrito = new Carrito(1234L, cliente, new BigDecimal("45000"));
		Producto product = new Producto("Camisa", new BigDecimal("45000"));
		carrito.getListaItem().add(new Item(carrito, product, 2, product.getPrecio()));
		log.info("Se adicionó al carrito: " + carrito);
	}

	@Override
	public Long guardarVenta(Long idCarrito) {
		log.info("Se guardó la venta de la tienda: " + idCarrito);
		return (long) Math.random();
	}

}

package com.tienda.tienda.model;

import java.math.BigDecimal;


public class Item {
	private Long idItem;
	private Carrito carrito;
	private Producto producto;
	private Venta venta;
	private BigDecimal precio;
	private int cantidad;

	public Item() {
	}

	public Item(Carrito carrito, Producto producto, int cantidad, BigDecimal precio) {
		this.carrito = carrito;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	
	/**
	 * @return the idItem
	 */
	public Long getIdItem() {
		return idItem;
	}

	/**
	 * @param idItem the idItem to set
	 */
	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}

	/**
	 * @return the carrito
	 */
	public Carrito getCarrito() {
		return carrito;
	}

	/**
	 * @param carrito the carrito to set
	 */
	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}

	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	/**
	 * @return the venta
	 */
	public Venta getVenta() {
		return venta;
	}

	/**
	 * @param venta the venta to set
	 */
	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the precio
	 */
	public BigDecimal getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
}

package com.tienda.tienda.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Producto {
	private String idProducto;
	private String nombre;
	private BigDecimal precio;
	private Categoria categoria;
	private List<Item> listaItems = new ArrayList<Item>();
	
	public Producto() {
	}

	public Producto(String nombre, BigDecimal precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto(Categoria categoria, String nombre, BigDecimal precio, List<Item> listaItems) {
		this.categoria = categoria;
		this.nombre = nombre;
		this.precio = precio;
		this.listaItems = listaItems;
	}
	
	/**
	 * @return the idProducto
	 */
	public String getIdProducto() {
		return idProducto;
	}

	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	/**
	 * @return the listaItems
	 */
	public List<Item> getListaItems() {
		return listaItems;
	}
	/**
	 * @param listaItems the listaItems to set
	 */
	public void setListaItems(List<Item> listaItems) {
		this.listaItems = listaItems;
	}
	
	
}

package com.tienda.tienda.model;


import java.util.ArrayList;
import java.util.List;

public class Categoria implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idCategoria;
	private String descripcion;
	private List<Producto> productos = new ArrayList<Producto>();

	public Categoria() {
	}

	public Categoria(String description) {
		this.descripcion = description;
	}

	public Categoria(String descripcion, List<Producto> productos) {
		this.descripcion = descripcion;
		this.productos = productos;
	}

	public Integer getIdcategoria() {
		return this.idCategoria;
	}

	public void setIdcategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

}

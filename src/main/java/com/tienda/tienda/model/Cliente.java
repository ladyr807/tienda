package com.tienda.tienda.model;


import java.util.ArrayList;
import java.util.List;

public class Cliente implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idCliente;
	private String nombres;
	private String tipoIdentificacion;
	private String identificacion;
	private List<Venta> ventas = new ArrayList<Venta>();
	private List<Carrito> carritos = new ArrayList<Carrito>();

	public Cliente() {
	}

	public Cliente(Long idCliente, String nombres, String tipoIdentificacion, String identificacion) {
		this.idCliente = idCliente;
		this.nombres = nombres;
		this.tipoIdentificacion = tipoIdentificacion;
		this.identificacion = identificacion;
	}

	public Long getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getTipoIdentificacion() {
		return this.tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public List<Venta> getVentas() {
		return this.ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public List<Carrito> getCarritos() {
		return this.carritos;
	}

	public void setCarritos(List<Carrito> carritos) {
		this.carritos = carritos;
	}
}

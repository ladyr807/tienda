package com.tienda.tienda.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {
	private Long idVenta;
	private Cliente cliente;
	private Date fechaEntrega;
	private String direccionEntrega;
	private BigDecimal total;
	private List<Item> listaItems = new ArrayList<Item>();
	
	public Venta() {
		
	}
	
	public Venta(Long idVenta, Cliente cliente, Date fechaEntrega, String direccionEntrega, BigDecimal total,
			List<Item> listaItems) {
		super();
		this.idVenta = idVenta;
		this.cliente = cliente;
		this.fechaEntrega = fechaEntrega;
		this.direccionEntrega = direccionEntrega;
		this.total = total;
		this.listaItems = listaItems;
	}
	/**
	 * @return the idVenta
	 */
	public Long getIdVenta() {
		return idVenta;
	}
	/**
	 * @param idVenta the idVenta to set
	 */
	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return the fechaEntrega
	 */
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	/**
	 * @param fechaEntrega the fechaEntrega to set
	 */
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	/**
	 * @return the direccionEntrega
	 */
	public String getDireccionEntrega() {
		return direccionEntrega;
	}
	/**
	 * @param direccionEntrega the direccionEntrega to set
	 */
	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}
	/**
	 * @return the total
	 */
	public BigDecimal getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
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
	
	public Venta prepararVenta() {
		Venta order = new Venta(this.idVenta, this.cliente, this.fechaEntrega, 
				this.direccionEntrega, this.total, this.listaItems);
		return order;
	}
	
}

package com.tienda.tienda.model;

import java.math.BigDecimal;
import java.util.List;

public class Carrito {
	private Long idCarrito;
	private Cliente cliente;
	private BigDecimal subtotal;
	private List<Item> listaItem;

	public Carrito() {
	}

	public Carrito(Long idCart, Cliente cliente, BigDecimal subtotal) {
		this.idCarrito = idCart;
		this.cliente = cliente;
		this.subtotal = subtotal;
	}

	public Carrito(Long idCart, Cliente cliente, BigDecimal subtotal, List<Item> listaItem) {
		this.idCarrito = idCart;
		this.cliente = cliente;
		this.subtotal = subtotal;
		this.listaItem = listaItem;
	}
	
	/**
	 * @return the idCart
	 */
	public Long getIdCart() {
		return idCarrito;
	}

	/**
	 * @param idCart the idCart to set
	 */
	public void setIdCart(Long idCart) {
		this.idCarrito = idCart;
	}

	/**
	 * @return the clienteS
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param clienteS the clienteS to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the subtotal
	 */
	public BigDecimal getSubtotal() {
		return subtotal;
	}

	/**
	 * @param subtotal the subtotal to set
	 */
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * @return the listaItem
	 */
	public List<Item> getListaItem() {
		return listaItem;
	}

	/**
	 * @param listaItem the listaItem to set
	 */
	public void setListaItem(List<Item> listaItem) {
		this.listaItem = listaItem;
	}
	
	public BigDecimal calcularTotal(){
		BigDecimal total = BigDecimal.ZERO;
		for (Item lineItem : this.getListaItem()) {
			total.add(lineItem.getPrecio().multiply(new BigDecimal(lineItem.getCantidad())));		
		}
		return total;
	}
}

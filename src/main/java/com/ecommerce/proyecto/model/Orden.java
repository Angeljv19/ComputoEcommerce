package com.ecommerce.proyecto.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordenes")

public class Orden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecivida;
	private double total;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToOne(mappedBy = "orden")
	private DetalleOrden detalle;
	
	public Orden() {
		// TODO Auto-generated constructor stub
	}



	public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecivida, double total, Usuario usuario,
			DetalleOrden detalle) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.fechaRecivida = fechaRecivida;
		this.total = total;
		this.usuario = usuario;
		this.detalle = detalle;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaRecivida() {
		return fechaRecivida;
	}

	public void setFechaRecivida(Date fechaRecivida) {
		this.fechaRecivida = fechaRecivida;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

	public DetalleOrden getDetalle() {
		return detalle;
	}

	public void setDetalle(DetalleOrden detalle) {
		this.detalle = detalle;
	}

	
	
	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", fechaRecivida="
				+ fechaRecivida + ", total=" + total + "]";
	}
	

}

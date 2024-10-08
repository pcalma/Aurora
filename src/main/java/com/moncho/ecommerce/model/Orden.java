package com.moncho.ecommerce.model;

import java.util.Date;
import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "oden") 
public class Orden {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String numero;
	private Date fecha_creacion;
	private Date fecha_recibida;
	private double total;
	
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToMany(mappedBy ="orden")
	private List<DetalleOrden> detalle;
	
	public Orden() {
		// TODO Auto-generated constructor stub
	}


	public Orden(Integer id, String numero, Date fecha_creacion, Date fecha_recibida, double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.fecha_creacion = fecha_creacion;
		this.fecha_recibida = fecha_recibida;
		this.total = total;
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


	public Date getFecha_creacion() {
		return fecha_creacion;
	}


	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}


	public Date getFecha_recibida() {
		return fecha_recibida;
	}


	public void setFecha_recibida(Date fecha_recibida) {
		this.fecha_recibida = fecha_recibida;
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


	public List<DetalleOrden> getDetalle() {
		return detalle;
	}


	public void setDetalle(List<DetalleOrden> detalle) {
		this.detalle = detalle;
	}


	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fecha_creacion=" + fecha_creacion + ", fecha_recibida="
				+ fecha_recibida + ", total=" + total + "]";
	}
	
	
	
	
}

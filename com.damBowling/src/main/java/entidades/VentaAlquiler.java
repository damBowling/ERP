package entidades;

// Generated 13-oct-2012 1:52:26 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * VentaAlquiler generated by hbm2java
 */
public class VentaAlquiler implements java.io.Serializable {

	private Integer id;
	private Empleados empleados;
	private Accesorios accesorios;
	private Date fechaInicio;
	private Date fechaDevolucioAlq;
	private Date fechaDevolucion;

	public VentaAlquiler() {
	}

	public VentaAlquiler(Empleados empleados, Accesorios accesorios,
			Date fechaInicio, Date fechaDevolucioAlq) {
		this.empleados = empleados;
		this.accesorios = accesorios;
		this.fechaInicio = fechaInicio;
		this.fechaDevolucioAlq = fechaDevolucioAlq;
	}

	public VentaAlquiler(Empleados empleados, Accesorios accesorios,
			Date fechaInicio, Date fechaDevolucioAlq, Date fechaDevolucion) {
		this.empleados = empleados;
		this.accesorios = accesorios;
		this.fechaInicio = fechaInicio;
		this.fechaDevolucioAlq = fechaDevolucioAlq;
		this.fechaDevolucion = fechaDevolucion;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Empleados getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}

	public Accesorios getAccesorios() {
		return this.accesorios;
	}

	public void setAccesorios(Accesorios accesorios) {
		this.accesorios = accesorios;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaDevolucioAlq() {
		return this.fechaDevolucioAlq;
	}

	public void setFechaDevolucioAlq(Date fechaDevolucioAlq) {
		this.fechaDevolucioAlq = fechaDevolucioAlq;
	}

	public Date getFechaDevolucion() {
		return this.fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

}
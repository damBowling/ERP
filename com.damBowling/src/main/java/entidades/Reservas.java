package entidades;

// Generated 15-oct-2012 13:40:25 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Reservas generated by hbm2java
 */
public class Reservas implements java.io.Serializable {

	private Integer id;
	private Socio socio;
	private Empleados empleados;
	private int pista;
	private Date fechaInicio;
	private Date fechaFin;
	private boolean anulado;

	public Reservas() {
	}

	public Reservas(Socio socio, Empleados empleados, int pista,
			Date fechaInicio, Date fechaFin, boolean anulado) {
		this.socio = socio;
		this.empleados = empleados;
		this.pista = pista;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.anulado = anulado;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Socio getSocio() {
		return this.socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public Empleados getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}

	public int getPista() {
		return this.pista;
	}

	public void setPista(int pista) {
		this.pista = pista;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public boolean isAnulado() {
		return this.anulado;
	}

	public void setAnulado(boolean anulado) {
		this.anulado = anulado;
	}

}

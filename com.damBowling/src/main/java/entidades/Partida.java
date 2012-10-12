package entidades;

// Generated 13-oct-2012 1:52:26 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Partida generated by hbm2java
 */
public class Partida implements java.io.Serializable {

	private Integer id;
	private Pistas pistas;
	private Date fecha;
	private Set puntuacions = new HashSet(0);

	public Partida() {
	}

	public Partida(Pistas pistas, Date fecha) {
		this.pistas = pistas;
		this.fecha = fecha;
	}

	public Partida(Pistas pistas, Date fecha, Set puntuacions) {
		this.pistas = pistas;
		this.fecha = fecha;
		this.puntuacions = puntuacions;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Pistas getPistas() {
		return this.pistas;
	}

	public void setPistas(Pistas pistas) {
		this.pistas = pistas;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Set getPuntuacions() {
		return this.puntuacions;
	}

	public void setPuntuacions(Set puntuacions) {
		this.puntuacions = puntuacions;
	}

}
package entidades;

// Generated 15-oct-2012 13:40:25 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Proveedores generated by hbm2java
 */
public class Proveedores implements java.io.Serializable {

	private String cif;
	private String nombreEmpresa;
	private int telefono;
	private String correo;
	private String direccion;
	private String nombreContacto;
	private Set accesorioses = new HashSet(0);

	public Proveedores() {
	}

	public Proveedores(String cif, String nombreEmpresa, int telefono,
			String direccion) {
		this.cif = cif;
		this.nombreEmpresa = nombreEmpresa;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public Proveedores(String cif, String nombreEmpresa, int telefono,
			String correo, String direccion, String nombreContacto,
			Set accesorioses) {
		this.cif = cif;
		this.nombreEmpresa = nombreEmpresa;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.nombreContacto = nombreContacto;
		this.accesorioses = accesorioses;
	}

	public String getCif() {
		return this.cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombreEmpresa() {
		return this.nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombreContacto() {
		return this.nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public Set getAccesorioses() {
		return this.accesorioses;
	}

	public void setAccesorioses(Set accesorioses) {
		this.accesorioses = accesorioses;
	}

}

package entidades;

// Generated 15-oct-2012 13:40:25 by Hibernate Tools 3.4.0.CR1

/**
 * Usuario generated by hbm2java
 */
public class Usuario implements java.io.Serializable {

	private UsuarioId id;
	private Empleados empleados;
	private Socio socio;
	private String pass;
	private String fraseDePaso;

	public Usuario() {
	}

	public Usuario(UsuarioId id, Empleados empleados, Socio socio, String pass) {
		this.id = id;
		this.empleados = empleados;
		this.socio = socio;
		this.pass = pass;
	}

	public Usuario(UsuarioId id, Empleados empleados, Socio socio, String pass,
			String fraseDePaso) {
		this.id = id;
		this.empleados = empleados;
		this.socio = socio;
		this.pass = pass;
		this.fraseDePaso = fraseDePaso;
	}

	public UsuarioId getId() {
		return this.id;
	}

	public void setId(UsuarioId id) {
		this.id = id;
	}

	public Empleados getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}

	public Socio getSocio() {
		return this.socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getFraseDePaso() {
		return this.fraseDePaso;
	}

	public void setFraseDePaso(String fraseDePaso) {
		this.fraseDePaso = fraseDePaso;
	}

}

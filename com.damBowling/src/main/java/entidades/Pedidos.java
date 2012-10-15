package entidades;

// Generated 15-oct-2012 13:40:25 by Hibernate Tools 3.4.0.CR1

/**
 * Pedidos generated by hbm2java
 */
public class Pedidos implements java.io.Serializable {

	private Integer idPedido;
	private Empleados empleados;
	private Accesorios accesorios;
	private String proveedor;
	private String cantidad;

	public Pedidos() {
	}

	public Pedidos(Empleados empleados, Accesorios accesorios,
			String proveedor, String cantidad) {
		this.empleados = empleados;
		this.accesorios = accesorios;
		this.proveedor = proveedor;
		this.cantidad = cantidad;
	}

	public Integer getIdPedido() {
		return this.idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
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

	public String getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

}

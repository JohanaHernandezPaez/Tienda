package modelo;

public class VentasDTO {
	private long codigo_venta;
	private long cedula_cliente;
	private long Cedula_Usuario;
	private double ivaventa;
	private double totalventa;
	private double valorventa;
	
	
	public VentasDTO(long cedula_cliente, long cedula_Usuario, double ivaventa, double totalventa, double valorventa) {
		super();
		this.cedula_cliente = cedula_cliente;
		Cedula_Usuario = cedula_Usuario;
		this.ivaventa = ivaventa;
		this.totalventa = totalventa;
		this.valorventa = valorventa;
	}
	public VentasDTO(long codigo_venta, long cedula_cliente, long cedula_Usuario, double ivaventa, double totalventa,
			double valorventa) {
		super();
		this.codigo_venta = codigo_venta;
		this.cedula_cliente = cedula_cliente;
		Cedula_Usuario = cedula_Usuario;
		this.ivaventa = ivaventa;
		this.totalventa = totalventa;
		this.valorventa = valorventa;
	}
	public long getCodigo_venta() {
		return codigo_venta;
	}
	public void setCodigo_venta(long codigo_venta) {
		this.codigo_venta = codigo_venta;
	}
	public long getCedula_cliente() {
		return cedula_cliente;
	}
	public void setCedula_cliente(long cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}
	public long getCedula_Usuario() {
		return Cedula_Usuario;
	}
	public void setCedula_Usuario(long cedula_Usuario) {
		Cedula_Usuario = cedula_Usuario;
	}
	public double getIvaventa() {
		return ivaventa;
	}
	public void setIvaventa(double ivaventa) {
		this.ivaventa = ivaventa;
	}
	public double getTotalventa() {
		return totalventa;
	}
	public void setTotalventa(double totalventa) {
		this.totalventa = totalventa;
	}
	public double getValorventa() {
		return valorventa;
	}
	public void setValorventa(double valorventa) {
		this.valorventa = valorventa;
	}

}

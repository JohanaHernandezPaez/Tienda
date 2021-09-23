package modelo;

public class LineasDTO {
	private int codigolinea;
	private String nombreLinea;

	public LineasDTO(int codigolinea, String nombreLinea) {

		this.codigolinea = codigolinea;
		this.nombreLinea = nombreLinea;
	}
	public LineasDTO(int codigolinea) {

		this.codigolinea = codigolinea;

	}

	public int getCodigolinea() {
		return codigolinea;
	}

	public void setCodigolinea(int codigolinea) {
		this.codigolinea = codigolinea;
	}

	public String getNombreLinea() {
		return nombreLinea;
	}

	public void setNombreLinea(String nombreLinea) {
		this.nombreLinea = nombreLinea;
	}

}

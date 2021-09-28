package modelo;

public class ClientesDTO {
	private Long Cedula_cliente;
	private String Direccion_cliente;
	private String Email_cliente;
	private String Nombre_cliente;
	private String Telefono_cliente;

	public ClientesDTO(long cedula_cliente, String direccion_cliente, String email_cliente, String nombre_cliente,
			String telefono_cliente) {

		this.Cedula_cliente = cedula_cliente;
		this.Direccion_cliente = direccion_cliente;
		this.Email_cliente = email_cliente;
		this.Nombre_cliente = nombre_cliente;
		this.Telefono_cliente = telefono_cliente;

	}
	
	public ClientesDTO(long cedula_usuario) {
		this.Cedula_cliente = cedula_usuario;
	}

	public Long getCedula_cliente() {
		return Cedula_cliente;
	}

	public void setCedula_cliente(long cedula_cliente) {
		Cedula_cliente = cedula_cliente;
	}

	public String getDireccion_cliente() {
		return Direccion_cliente;
	}

	public void setDireccion_cliente(String direccion_cliente) {
		Direccion_cliente = direccion_cliente;
	}

	public String getEmail_cliente() {
		return Email_cliente;
	}

	public void setEmail_cliente(String email_cliente) {
		Email_cliente = email_cliente;
	}

	public String getNombre_cliente() {
		return Nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		Nombre_cliente = nombre_cliente;
	}

	public String getTelefono_cliente() {
		return Telefono_cliente;
	}

	public void setTelefono_cliente(String telefono_cliente) {
		Telefono_cliente = telefono_cliente;
	}

}

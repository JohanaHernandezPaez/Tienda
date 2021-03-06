package modelo;

public class UsuariosDTO {

	//DTO es un patr?n que habla de las clases b?sicas d?nde se hace referencia a los atributos de los usuarios solo van los constructores, getter and setter.
	
	private long cedula_usuario;
	private String email_usuario;
	private String nombre_usuario;
	private String password;
	private String usuario;
	
	public UsuariosDTO(long cedula_usuario, String email_usuario, String nombre_usuario, String password, String usuario) {
		super();
		this.cedula_usuario = cedula_usuario;
		this.email_usuario = email_usuario;
		this.nombre_usuario = nombre_usuario;
		this.usuario = usuario;
		this.password = password;
		
		
	}
	public UsuariosDTO(String usuario, String password) {
		super();
		this.usuario = usuario;
		this.password = password;
		
		
		
	}
	public UsuariosDTO(long cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}

	public long getCedula_usuario() {
		return cedula_usuario;
	}

	public void setCedula_usuario(long cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}

	public String getEmail_usuario() {
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Usuarios_DTO [Cedula_Usuario=" + cedula_usuario + ", nombre_usuario=" + nombre_usuario
				+ ", email_usuario=" + email_usuario + ", Usuario=" + usuario + ", Password=" + password + "]";
	}
	
}

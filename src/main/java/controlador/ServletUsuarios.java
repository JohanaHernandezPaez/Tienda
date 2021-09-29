package controlador;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.catalina.connector.Response;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import modelo.UsuariosDAO;
import modelo.UsuariosDTO;

/**
 * Servlet implementation class ServletUsuarios
 */
@WebServlet("/ServletUsuarios")
public class ServletUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ServletUsuarios() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean x;
		doGet(request, response);
		UsuariosDTO usudto;
		UsuariosDAO usudao;
		UsuariosDTO registro;
		long cedula_usuario;
		String email_usuario, nombre_usuario, password, usuario;
		if (request.getParameter("btninsUsu") != null)
			;
		{
			cedula_usuario = Long.parseLong(request.getParameter("cedula_usuario"));
			email_usuario = request.getParameter("email_usuario");
			nombre_usuario = request.getParameter("nombre_usuario");
			usuario = request.getParameter("usuario");
			password = request.getParameter("password");

			usudto = new UsuariosDTO(cedula_usuario, email_usuario, nombre_usuario, usuario, password);
			usudao = new UsuariosDAO();
			x = usudao.insertarusuario(usudto);
			// solo entra x si es verdadero
			if (x == true) {
				JOptionPane.showMessageDialog(null, "El usuario ha sido registrado");
				response.sendRedirect("usuarios.jsp");

			}
		}
				
			// consultar un usuario
		if(request.getParameter("btnconUsu")!=null) {
			String nom, email, usu, pass;
			long ced;
			ced = Long.parseLong(request.getParameter("cedula_usuario"));
			usudto = new UsuariosDTO(ced);
			usudao = new UsuariosDAO();
			registro = usudao.consultar(usudto);
			
			if (registro != null) {
				ced = registro.getCedula_usuario();
				nom = registro.getNombre_usuario();
				email = registro.getEmail_usuario();
				pass = registro.getPassword();
				usu = registro.getUsuario();
				response.sendRedirect("usuarios.jsp?co=" + ced + "&&no=" + nom + "&&em=" + email+ "&&pa="+ pass+ "&&us="+usu);
			} else {
				JOptionPane.showMessageDialog(null, "No hay datos");
			}
		}
		// actualizacion de usuarios
		if (request.getParameter("btnactUsu") != null) {
			int dat;
			nombre_usuario = request.getParameter("nombre_usuario");
			cedula_usuario = Long.parseLong(request.getParameter("cedula_usuario"));
			email_usuario = request.getParameter("email_usuario");
			password = request.getParameter("password");
			usuario = request.getParameter("usuario");
			usudto = new UsuariosDTO(cedula_usuario, email_usuario, nombre_usuario, usuario, password);
			usudao = new UsuariosDAO();
			dat = usudao.actualizar(usudto);
			

			if (dat > 0) {
				JOptionPane.showMessageDialog(null, "Linea actualizada");
				response.sendRedirect("usuarios.jsp");
			} else {
				JOptionPane.showMessageDialog(null, "Linea no actualizada");
				response.sendRedirect("usuarios.jsp");	
			}
		}

		// Eliminar usuario

		if (request.getParameter("btneliUsu") != null) {
			int dat;
			cedula_usuario = Long.parseLong(request.getParameter("cedula_usuario"));
			usudto = new UsuariosDTO(cedula_usuario);
			usudao = new UsuariosDAO();
			dat = usudao.eliminar(usudto);
			if (dat > 0) {
				JOptionPane.showMessageDialog(null, "Linea eliminada");
				response.sendRedirect("usuarios.jsp");
			} else {
				JOptionPane.showMessageDialog(null, "Linea no eliminada");
				response.sendRedirect("usuarios.jsp");
			}
		}

	}
}
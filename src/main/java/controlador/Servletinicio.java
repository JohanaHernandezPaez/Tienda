package controlador;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;



/**
 * Servlet implementation class Servletinicio
 */
@WebServlet("/Servletinicio")
public class Servletinicio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Servletinicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario,password;
		usuario=request.getParameter("usuario");
		password=request.getParameter("password");
		//System.out.println("usuario :"+usuario);
		//System.out.println("password :"+password);
		
		if  (usuario.equals("admininicial")&& password.equals("admin123456")) {
			System.out.println("Welcome. . . ");
			JOptionPane.showMessageDialog(null, "Bienvenido al programa");
			//response.sendRedirect("wellcome.jsp");
			//
			response.sendRedirect("vistados.jsp?dato=");
			
			
		}else {
			System.out.println("Error en las credenciales de acceso");
			JOptionPane.showMessageDialog(null, "credenciales Erradas");
			response.sendRedirect("login.jsp");
			
		}	
		
	}

}

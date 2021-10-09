package controlador;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.LoginDAO;
import modelo.UsuariosDTO;

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
response.getWriter().append("Served at: ").append(request.getContextPath());	
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion=request.getSession();
		try {
			if(request.getParameter("ingresar")!=null) {
			String usuario,password;
			UsuariosDTO usudto;
			usuario=request.getParameter("usuario");
			password=request.getParameter("password");
			UsuariosDTO usu=new UsuariosDTO(usuario, password);
			LoginDAO lodao=new LoginDAO();
			usudto=lodao.login(usu);
			//System.out.println(usudto.getNombre_usuario());
			
			if  (usudto.getUsuario().equals(usuario) && usudto.getPassword().equals(password)) {
				//System.out.println("Welcome. . . ");
				JOptionPane.showMessageDialog(null, "Bienvenido al programa");
				//response.sendRedirect("wellcome.jsp");
				//primer parametro de sesion la variable de sesion, el valor usudto es el valor
				String uss=usudto.getUsuario();
				sesion.setAttribute("vs", uss);
				response.sendRedirect("vistados.jsp");
				
				
			}else {
				System.out.println("Error en las credenciales de acceso");
				JOptionPane.showMessageDialog(null, "credenciales Erradas");
				response.sendRedirect("login.jsp");}
			
		}
			} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "credenciales Erradas");
			response.sendRedirect("login.jsp");
		}	
		
	}

}

package controlador;

import java.util.ArrayList;
import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.ClientesDAO;
import modelo.ClientesDTO;
import modelo.UsuariosDAO;
import modelo.UsuariosDTO;
import com.google.gson.Gson;

/**
 * Servlet implementation class ServletReportes
 */
@WebServlet("/ServletReportes")
@MultipartConfig
public class ServletReportes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ServletReportes() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ClientesDAO clidao;
		clidao = new ClientesDAO();
		Gson gson = new Gson();
		ArrayList<ClientesDTO> listacli = new ArrayList<>();
		listacli = clidao.consultageneral();
		out.print(gson.toJson(listacli));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// PrintWriter sirve para mostrar los datos en pantalla y enviar los datos hacia
		// AJAX
		PrintWriter out = response.getWriter();
		UsuariosDAO usudao;
		usudao = new UsuariosDAO();
		ArrayList<UsuariosDTO> listausu = new ArrayList<>();
		listausu = usudao.consultageneral();
		Gson gson = new Gson();
		out.print(gson.toJson(listausu));

	}
}

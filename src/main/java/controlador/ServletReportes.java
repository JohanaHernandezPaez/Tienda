package controlador;


import java.util.ArrayList;
import java.io.*;

import javax.swing.JOptionPane;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.ClientesDAO;
import modelo.UsuariosDAO;
import modelo.VentasDAO;
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//PrintWriter sirve para mostrar los datos en pantalla y enviar los datos hacia AJAX
		PrintWriter out=response.getWriter();
		UsuariosDAO usudao;
		//ClientesDAO clidao;
		//VentasDAO vendao;
		//if(request.getParameter("cargausuarios")!=null) {
		usudao=new UsuariosDAO();
		ArrayList<UsuariosDTO>listausu=new ArrayList<>();
		listausu=usudao.consultageneral();
		System.out.println(listausu);;
		Gson gson=new Gson();
		System.out.println(gson.toJson(listausu));
		out.print(gson.toJson(listausu));
	//}
	}
}

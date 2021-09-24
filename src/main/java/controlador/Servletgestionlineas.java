package controlador;

import java.io.IOException;

import javax.swing.JOptionPane;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.LineasDTO;
import modelo.lineasDAO;


/**
 * Servlet implementation class Servletgestionlineas.java
 */
@WebServlet("/Servletgestionlineas")
public class Servletgestionlineas extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servletgestionlineas() {
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
		boolean x;
		String nombrelinea;
		int codigo;
		LineasDTO lindto;
		lineasDAO lindao;
		LineasDTO registro;
		if (request.getParameter("btnins")!=null) {
			
			codigo=Integer.parseInt(request.getParameter("codlin"));
			nombrelinea=request.getParameter("nomlin");
			lindto=new LineasDTO(codigo, nombrelinea);
			lindao=new lineasDAO();
			x=lindao.insertarlinea(lindto);
			if(x) {
				JOptionPane.showMessageDialog(null, "se inserto la linea");
				response.sendRedirect("index.jsp");
				
			}
			else {
				JOptionPane.showMessageDialog(null, "se inserto la linea");
				response.sendRedirect("index.jsp");
				
			}
	
		}
		//consultar un usuario
		//consultar un usuario
		//consultar un usuario
		//consultar un usuario
		//consultar un usuario
		if(request.getParameter("btncon")!=null) {
			String nom;
			int cod;
			codigo=Integer.parseInt(request.getParameter("codlin"));
			JOptionPane.showMessageDialog(null, codigo);
			lindto= new LineasDTO(codigo);
			lindao= new lineasDAO();
			registro=lindao.consultar(lindto);
			if(registro!=null) {
				cod=registro.getCodigolinea();
				nom=registro.getNombreLinea();
				response.sendRedirect("index.jsp?co="+cod+"&&no="+nom);
			}
			else {
				JOptionPane.showMessageDialog(null, "No hay datos");
			}
		}
		//actualizacion de lineas
		if(request.getParameter("btnact")!=null) {
			int dat;
			nombrelinea=request.getParameter("nomlin");
			codigo=Integer.parseInt(request.getParameter("codlin"));
			lindto=new LineasDTO(codigo, nombrelinea);
			lindao=new lineasDAO();
			dat=lindao.actualizar(lindto);

			if(dat>0) {
				JOptionPane.showMessageDialog(null, "Linea actualizada");
				response.sendRedirect("index.jsp");
			}else {
				JOptionPane.showMessageDialog(null, "Linea no actualizada");
				response.sendRedirect("index.jsp");
			}
		}
		
		//Eliminar linea
		
		if(request.getParameter("btneli")!=null) {
			int dat;
			codigo=Integer.parseInt(request.getParameter("codlin"));
			lindto= new LineasDTO(codigo);
			lindao=new lineasDAO();
			dat=lindao.eliminar(lindto);
			if(dat>0) {
				JOptionPane.showMessageDialog(null, "Linea eliminada");
				response.sendRedirect("index.jsp");
			}else {
				JOptionPane.showMessageDialog(null, "Linea no eliminada");
				response.sendRedirect("index.jsp");
			}
		}
		

	}
	
}

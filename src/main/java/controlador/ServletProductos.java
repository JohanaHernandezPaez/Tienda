package controlador;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JOptionPane;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import modelo.ProductosDAO;

/**
 * Servlet implementation class ServletProductos
 */
@WebServlet("/ServletProductos")
@MultipartConfig
public class ServletProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * Default constructor.
	 */
	public ServletProductos() {
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
		doGet(request, response);

		Part archivo = request.getPart("archivo");
		// String
		// Url="C:\\\\Users\\\\user\\\\eclipse-workspace\\\\Proyectociclo3v12\\\\src\\\\main\\\\webapp\\\\documentos";
		String Url = "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/";

		
			if (request.getParameter("cargar") != null) {
				try {
					// clases para trabajar archivos InputStream File y FileOutputStream
					InputStream file = archivo.getInputStream();
					File copia = new File(Url + "productos.csv");
					FileOutputStream escribir = new FileOutputStream(copia);
					int num = file.read();
					// el ultimo byte termina en 0 cuando va a -1 termina la lectura.
					while (num != -1) {
						// write genera la copia del archivo.
						escribir.write(num);
						num = file.read();
					}
					file.close();
					escribir.close();

					JOptionPane.showMessageDialog(null, "se cargó el archivo correctamente");
					boolean x;
					ProductosDAO prodao = new ProductosDAO();
					x = prodao.cargarproductos(Url + "productos.csv");
					if (x) {
						JOptionPane.showMessageDialog(null, "datos cargados en la base de datos");
						response.sendRedirect("vistados.jsp");
					} else {
						JOptionPane.showMessageDialog(null, "No se cargaron los datos");
						response.sendRedirect("productos.jsp");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "error al cargar el archivo");
					response.sendRedirect("productos.jsp");
				}

			}
		}
	
}

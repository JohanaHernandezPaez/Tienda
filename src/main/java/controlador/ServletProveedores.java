package controlador;

import java.io.IOException;

import javax.swing.JOptionPane;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.ProveedoresDAO;
import modelo.ProveedoresDTO;


/**
 * Servlet implementation class ServletProveedores
 */
@WebServlet("/ServletProveedores")
public class ServletProveedores extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletProveedores() {
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
		doGet(request, response);
		long Nit_Proveedor;
		String Nombre_Proveedor;
		String Direccion_Proveedor;
		String Telefono_Proveedor;
		String Ciudad_Proveedor;
		
		ProveedoresDTO ProveeDTO;
		ProveedoresDAO ProveeDAO;
		
			
		if (request.getParameter("btn_Proveedores")!=null) {
						
			Nit_Proveedor=Long.parseLong(request.getParameter("nitproveedor"));
			Nombre_Proveedor=request.getParameter("nombre_proveedor");
			Direccion_Proveedor=request.getParameter("direccion_proveedor");
			Telefono_Proveedor=request.getParameter("telefono_proveedor");
			Ciudad_Proveedor=request.getParameter("ciudad_proveedor");
						
			ProveeDTO=new ProveedoresDTO(Nit_Proveedor, Nombre_Proveedor, Direccion_Proveedor, Telefono_Proveedor, Ciudad_Proveedor);
			ProveeDAO=new ProveedoresDAO();
			
			x=ProveeDAO.insertarproveedor(ProveeDTO);
						
			if(x==true) {
				JOptionPane.showMessageDialog(null, "se inserto la linea");
				response.sendRedirect("vistados.jsp");
				
			}
			else {
				JOptionPane.showMessageDialog(null, "no se inserto la linea");
				response.sendRedirect("index.jsp");
				
			}
			
		}
		
		
		
	}

}

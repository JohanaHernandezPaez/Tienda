package controlador;

import java.io.IOException;
import java.rmi.registry.Registry;

import javax.swing.JOptionPane;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.ClientesDAO;
import modelo.ClientesDTO;
import modelo.ProveedoresDAO;
import modelo.ProveedoresDTO;

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
		String Nombre_Proveedor,Direccion_Proveedor,Telefono_Proveedor,Ciudad_Proveedor;
		
		ProveedoresDTO proveedoresDTO;
		ProveedoresDAO proveedoresDAO;
		ProveedoresDTO registro;
		
			
		if (request.getParameter("btninsPro")!=null) {
						
			Nit_Proveedor=Long.parseLong(request.getParameter("nitproveedor"));
			Nombre_Proveedor=request.getParameter("nombre_proveedor");
			Direccion_Proveedor=request.getParameter("direccion_proveedor");
			Telefono_Proveedor=request.getParameter("telefono_proveedor");
			Ciudad_Proveedor=request.getParameter("ciudad_proveedor");
						
			proveedoresDTO=new ProveedoresDTO(Nit_Proveedor, Nombre_Proveedor, Direccion_Proveedor, Telefono_Proveedor, Ciudad_Proveedor);
			proveedoresDAO=new ProveedoresDAO();
			
			x=proveedoresDAO.insertarproveedor(proveedoresDTO);
						
			if(x==true) {
				JOptionPane.showMessageDialog(null, "se inserto la linea");
				response.sendRedirect("proveedores.jsp");
				
			}
			else {
				JOptionPane.showMessageDialog(null, "no se inserto la linea");
				response.sendRedirect("proveedores.jsp");
				
			}
			
		}
		
		// consultar un proveedor
				if (request.getParameter("btnconPro") != null) {
					String np, dp, tp, cp;
					long nt;
					
					nt = Long.parseLong(request.getParameter("nitproveedor"));
					proveedoresDTO =new ProveedoresDTO(nt);
					proveedoresDAO =new ProveedoresDAO();
					registro = proveedoresDAO.consultar(proveedoresDTO);

					if (registro != null) {
						nt = registro.getNitproveedor();
						np = registro.getNombre_proveedor();
						dp = registro.getDireccion_proveedor();
						tp = registro.getTelefono_proveedor();
						cp = registro.getCiudad_proveedor();
						response.sendRedirect(
								"proveedores.jsp?nt=" + nt + "&&np=" + np + "&&dp=" + dp + "&&tp=" + tp + "&&cp=" + cp);
					} else {
						JOptionPane.showMessageDialog(null, "No hay datos");
						response.sendRedirect("proveedores.jsp");
					}
				}
		
				// actualizacion de proveedores
				if (request.getParameter("btnactPro") != null) {
					int dat;
					
					Nit_Proveedor=Long.parseLong(request.getParameter("nitproveedor"));
					Nombre_Proveedor=request.getParameter("nombre_proveedor");
					Direccion_Proveedor=request.getParameter("direccion_proveedor");
					Telefono_Proveedor=request.getParameter("telefono_proveedor");
					Ciudad_Proveedor=request.getParameter("ciudad_proveedor");
					proveedoresDTO=new ProveedoresDTO(Nit_Proveedor,Nombre_Proveedor,Direccion_Proveedor,Telefono_Proveedor,Ciudad_Proveedor);
					proveedoresDAO = new ProveedoresDAO();
					dat = proveedoresDAO.actualizar(proveedoresDTO);

					if (dat > 0) {
						JOptionPane.showMessageDialog(null, "Linea actualizada");
						response.sendRedirect("proveedores.jsp");
					} else {
						JOptionPane.showMessageDialog(null, "Linea no actualizada");
						response.sendRedirect("proveedores.jsp");
					}
				}
		
		
				// Eliminar proveedor

				if (request.getParameter("btneliPro") != null) {
					int dat;
					Nit_Proveedor=Long.parseLong(request.getParameter("nitproveedor"));
					proveedoresDTO =new ProveedoresDTO(Nit_Proveedor);
					proveedoresDAO= new ProveedoresDAO();dat = proveedoresDAO.eliminar(proveedoresDTO);
					if (dat > 0) {
						JOptionPane.showMessageDialog(null, "Linea eliminada");
						response.sendRedirect("proveedores.jsp");
					} else {
						JOptionPane.showMessageDialog(null, "Linea no eliminada");
						response.sendRedirect("proveedores.jsp");
					}
				}
		
		
	}

}

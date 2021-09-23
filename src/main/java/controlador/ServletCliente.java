package controlador;

import java.io.IOException;

import javax.swing.JOptionPane;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.ClientesDAO;
import modelo.ClientesDTO;



@WebServlet("/ServletCliente")
public class ServletCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletCliente() {
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
		int Cedula_cliente;
		String Direccion_cliente;
		String Email_cliente;
		String Nombre_cliente;
		String Telefono_cliente;
		
		ClientesDTO clientesDTO;
		ClientesDAO clientesDAO;
		
			
		if (request.getParameter("btncli")!=null) {
						
			Cedula_cliente=Integer.parseInt(request.getParameter("cedula_cliente"));
			Direccion_cliente=request.getParameter("direccion_cliente");
			Email_cliente=request.getParameter("email_cliente");
			Nombre_cliente=request.getParameter("nombre_cliente");
			Telefono_cliente=request.getParameter("telefono_cliente");
						
			clientesDTO=new ClientesDTO(Cedula_cliente, Direccion_cliente, Email_cliente, Nombre_cliente, Telefono_cliente);
					clientesDAO=new ClientesDAO();
			x=clientesDAO.insertarcliente(clientesDTO);
						
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

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
import modelo.UsuariosDAO;
import modelo.UsuariosDTO;

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
		boolean x;
		doGet(request, response);
		long Cedula_cliente;
		String Direccion_cliente, Email_cliente, Nombre_cliente, Telefono_cliente;

		ClientesDTO clientesDTO;
		ClientesDAO clientesDAO;
		ClientesDTO registro;

		if (request.getParameter("btninsCli") != null) {

			Cedula_cliente = Long.parseLong(request.getParameter("cedula_cliente"));
			Direccion_cliente = request.getParameter("direccion_cliente");
			Email_cliente = request.getParameter("email_cliente");
			Nombre_cliente = request.getParameter("nombre_cliente");
			Telefono_cliente = request.getParameter("telefono_cliente");

			clientesDTO = new ClientesDTO(Cedula_cliente, Direccion_cliente, Email_cliente, Nombre_cliente,
					Telefono_cliente);
			clientesDAO = new ClientesDAO();
			x = clientesDAO.insertarcliente(clientesDTO);

			if (x == true) {
				JOptionPane.showMessageDialog(null, "se inserto la linea");
				response.sendRedirect("vistados.jsp");

			} else {
				JOptionPane.showMessageDialog(null, "no se inserto la linea");
				response.sendRedirect("clientes.jsp");

			}
		}

		// consultar un usuario
		if (request.getParameter("btnconCli") != null) {
			String dir, email, nom, tel;
			long ced;
			ced = Long.parseLong(request.getParameter("cedula_cliente"));
			clientesDTO = new ClientesDTO(ced);
			clientesDAO = new ClientesDAO();
			registro = clientesDAO.consultar(clientesDTO);

			if (registro != null) {
				ced = registro.getCedula_cliente();
				dir = registro.getDireccion_cliente();
				email = registro.getEmail_cliente();
				nom = registro.getNombre_cliente();
				tel = registro.getTelefono_cliente();
				response.sendRedirect(
						"clientes.jsp?co=" + ced + "&&di=" + dir + "&&em=" + email + "&&no=" + nom + "&&te=" + tel);
			} else {
				JOptionPane.showMessageDialog(null, "No hay datos");
				response.sendRedirect("clientes.jsp");
			}
		}
		// actualizacion de clientes
		if (request.getParameter("btnactCli") != null) {
			int dat;
			Direccion_cliente = request.getParameter("direccion_cliente");
			Cedula_cliente = Long.parseLong(request.getParameter("cedula_cliente"));
			Email_cliente = request.getParameter("email_cliente");
			Nombre_cliente = request.getParameter("nombre_cliente");
			Telefono_cliente=request.getParameter("telefono_cliente");
			clientesDTO = new ClientesDTO(Cedula_cliente, Direccion_cliente, Email_cliente, Nombre_cliente, Telefono_cliente);
			clientesDAO = new ClientesDAO();
			dat = clientesDAO.actualizar(clientesDTO);

			if (dat > 0) {
				JOptionPane.showMessageDialog(null, "Linea actualizada");
				response.sendRedirect("clientes.jsp");
			} else {
				JOptionPane.showMessageDialog(null, "Linea no actualizada");
				response.sendRedirect("clientes.jsp");
			}
		}

		// Eliminar usuario

		if (request.getParameter("btneliCli") != null) {
			int dat;
			Cedula_cliente = Long.parseLong(request.getParameter("cedula_cliente"));
			clientesDTO = new ClientesDTO(Cedula_cliente);
			clientesDAO = new ClientesDAO();
			dat = clientesDAO.eliminar(clientesDTO);
			if (dat > 0) {
				JOptionPane.showMessageDialog(null, "Linea eliminada");
				response.sendRedirect("clientes.jsp");
			} else {
				JOptionPane.showMessageDialog(null, "Linea no eliminada");
				response.sendRedirect("clientes.jsp");
			}
		}

	}

}

package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.ReportesDTO;
import modelo.VentasDAO;

/**
 * Servlet implementation class ServletReporteVtas
 */
@WebServlet("/ServletReporteVtas")
public class ServletReporteVtas extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletReporteVtas() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		VentasDAO vendao;
		vendao = new VentasDAO();
		ArrayList<ReportesDTO> listaven = new ArrayList<>();
		listaven = vendao.consultageneral();
		System.out.println(listaven);
		Gson gson = new Gson();
		System.out.println(gson.toJson(listaven));
		out.print(gson.toJson(listaven));
	
	}

}

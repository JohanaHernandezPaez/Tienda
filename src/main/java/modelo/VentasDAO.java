package modelo;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import controlador.conexion;



public class VentasDAO {
	PreparedStatement ps = null;
	ResultSet rs = null;
	conexion con = new conexion();
	Connection cnn = con.conexionbd();
	VentasDTO ven;
	ReportesDTO reporte;

	public boolean insertarventa(VentasDTO ven) {
		boolean resultado = false;
		try {

			ps = cnn.prepareStatement(
					"Insert Into ventas(cedula_cliente,cedula_usuario,ivaventa,total_venta,valor_venta) value(?,?,?,?,?)");
			ps.setLong(1, ven.getCedula_cliente());
			ps.setLong(2, ven.getCedula_Usuario());
			ps.setDouble(3, ven.getIvaventa());
			ps.setDouble(4, ven.getTotalventa());
			ps.setDouble(5, ven.getValorventa());
			resultado = ps.executeUpdate() > 0;

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error al Insertar" + ex);
		}
		return resultado;
	}

	public VentasDTO consultarcodventa() {
		try {
			ps = cnn.prepareStatement(
					"SELECT MAX(codigo_venta),cedula_cliente,cedula_usuario,ivaventa,total_venta,valor_venta AS id FROM ventas");
			rs = ps.executeQuery();
			if (rs.next()) {

				// JOptionPane.showMessageDialog(null, "En el if");
				ven = new VentasDTO(rs.getLong(1), rs.getLong(2), rs.getLong(3), rs.getDouble(4), rs.getDouble(5),
						rs.getDouble(6));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ven;
	}
	
	public ArrayList<ReportesDTO> consultageneral() {
		ArrayList<ReportesDTO>lista=new ArrayList<ReportesDTO>();
		try {
			ps=cnn.prepareStatement("select c.cedula_cliente, c.nombre_cliente, sum(v.total_venta) as total "
					+ "from clientes c left join ventas v on c.cedula_cliente=v.cedula_cliente group by 1, 2");
			rs=ps.executeQuery();
			while(rs.next()) {
				reporte=new ReportesDTO(rs.getLong(1), rs.getString(2), rs.getDouble(3));
				lista.add(reporte);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;

	}
}

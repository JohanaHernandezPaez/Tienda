package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import controlador.conexion;

public class ProductosDAO {
	conexion con=new conexion();
	Connection cnn=con.conexionbd();
	PreparedStatement ps;

	public boolean cargarproductos(String URL) {
		JOptionPane.showMessageDialog(null, "en dao"+URL);
		boolean result=false;
		try {
			ps=cnn.prepareStatement( "load data infile '"+URL+"' into table productos fields terminated by ';'  lines terminated  by '\r\n';");
		result=ps.executeUpdate()>0;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al registrar productos: " + e);
		}
		return result;
		
	}
}

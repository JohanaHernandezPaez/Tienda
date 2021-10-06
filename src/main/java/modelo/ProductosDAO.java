package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import controlador.conexion;

public class ProductosDAO {
	conexion con=new conexion();
	Connection cnn=con.conexionbd();
	PreparedStatement ps;
	ResultSet rs=null;
	ProductoDTO prodto;

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
	
	public ProductoDTO consultarproducto(ProductoDTO pro) {
		try {
			ps=cnn.prepareStatement("SELECT * FROM productos WHERE codigo_producto=?");
			ps.setLong(1, pro.getCodigoproducto());
			rs=ps.executeQuery();
			if(rs.next()){
			 prodto=new ProductoDTO(rs.getLong(1), rs.getDouble(2), rs.getLong(3), rs.getString(4), rs.getDouble(5),rs.getDouble(6));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				  
		return prodto;  
	  }
	
}

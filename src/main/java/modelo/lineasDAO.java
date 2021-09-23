package modelo;

import controlador.conexion;

import java.sql.*;

import javax.swing.JOptionPane;
	public class lineasDAO {
		LineasDTO lineasdto;
		
	    conexion con=new conexion();
	    Connection cnn= con.conexionbd();
		PreparedStatement ps;
		public boolean insertarlinea(LineasDTO lin) {
		int r;
		
	    boolean dat=false;
	    try {
	        ps=cnn.prepareStatement("INSERT INTO lineas Values(?,?)");
	        ps.setInt(1, lin.getCodigolinea() );
	        ps.setString(2, lin.getNombreLinea());
	        r=ps.executeUpdate();
	        if(r>0) {
	            dat=true;
	        }
	     } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return dat;
	}
	
	public LineasDTO consultar(LineasDTO cod) {
		JOptionPane.showMessageDialog(null, cod.getCodigolinea());
		ResultSet rs;
		try {
			ps=cnn.prepareStatement("SELECT * FROM lineas WHERE codlinea=?");
			ps.setInt(1, cod.getCodigolinea());
			rs=ps.executeQuery();
			if(rs.next()) {
				lineasdto=new LineasDTO(rs.getInt(1),rs.getString(2));
			}
			else {
				return null;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return lineasdto;
	}
	
	//
	
	public int actualizar(LineasDTO linea) {
		int x=0;
		try {
			ps=cnn.prepareStatement("UPDATE lineas SET nomlinea=? WHERE codline=?");
			ps.setString(1, linea.getNombreLinea());
			ps.setInt(2, linea.getCodigolinea());
			ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return x;
		
	}
	
	public int eliminar(LineasDTO linea) {
		int x=0;
		try {
			ps=cnn.prepareStatement("DELETE FROM lineas WHERE codlinea=?");
			ps.setInt(1, linea.getCodigolinea());
			x=ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return x;
	}
	
	
}
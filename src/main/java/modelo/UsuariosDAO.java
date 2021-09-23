package modelo;

import java.sql.*;

import javax.swing.JOptionPane;

import controlador.conexion;

public class UsuariosDAO {

	// Aquí se genera el CRUD
	UsuariosDTO usuariosdto;


	conexion con = new conexion();
	Connection cnn = con.conexionbd();
	PreparedStatement ps;

	public boolean insertarusuario(UsuariosDTO usu) {
		int r;
		boolean dat = false;
		try {
			ps = cnn.prepareStatement("INSERT INTO usuarios Values(?,?,?,?,?)");
			ps.setLong(1, usu.getCedula_usuario());
			ps.setString(2, usu.getEmail_usuario());
			ps.setString(3, usu.getNombre_usuario());
			ps.setString(4, usu.getUsuario());
			ps.setString(5, usu.getPassword());
			
			r = ps.executeUpdate();
			if (r > 0) {
				dat = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dat;
	}
	
	public UsuariosDTO consultar(UsuariosDTO cedula_usuario) {
		JOptionPane.showMessageDialog(null, cedula_usuario.getCedula_usuario());
		ResultSet rs;
		try {
			ps=cnn.prepareStatement("SELECT * FROM usuarios WHERE cedula_usuario=?");
			ps.setLong(1, cedula_usuario.getCedula_usuario());
			rs=ps.executeQuery();
			if(rs.next()) {
				usuariosdto=new UsuariosDTO(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5));
							}
			else {
				return null;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return usuariosdto;
	}
	
	//
	
	public int actualizar(UsuariosDTO usuario) {
		int x=0;
		try {
			ps=cnn.prepareStatement("UPDATE usuarios SET nombre_usuario=?, email_usuario=?, password=?, usuario=? WHERE cedula_usuario=?");
			ps.setString(1, usuario.getNombre_usuario());
			ps.setString(2, usuario.getEmail_usuario());
			ps.setString(3, usuario.getPassword());
			ps.setString(4, usuario.getUsuario());
			ps.setLong(5, usuario.getCedula_usuario());
			x=ps.executeUpdate();
				}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return x;
		
	}
	
	public int eliminar(UsuariosDTO usuario) {
		int x=0;
		try {
			ps=cnn.prepareStatement("DELETE FROM usuarios WHERE cedula_usuario=?");
			ps.setLong(1, usuario.getCedula_usuario());
			x=ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return x;
	}

}

package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controlador.conexion;

public class LoginDAO {
	PreparedStatement ps = null;
	ResultSet res = null;
	conexion con = new conexion();
	Connection conexion = con.conexionbd();

	public UsuariosDTO login(UsuariosDTO usu) {
		UsuariosDTO us=null;
		try {
			String sql = "SELECT * FROM usuarios WHERE usuario=? and password=?";
			ps = conexion.prepareStatement(sql);
			ps.setString(1, usu.getUsuario());
			ps.setString(2, usu.getPassword());
			res = ps.executeQuery();
			if (res.next()) {
				us = new UsuariosDTO(res.getLong(1), res.getString(2), res.getString(3), res.getString(4),
						res.getString(5));

			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al consultar" + e);
		}
		return us;

	}
}

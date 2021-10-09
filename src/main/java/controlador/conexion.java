package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class conexion {

	Connection cnn;

	public Connection conexionbd() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				cnn=DriverManager.getConnection("jdbc:mysql://localhost/tienda_generica","root","Beijing123");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "problemas en la conexión");
			e.printStackTrace();
		}return cnn;

	}

}

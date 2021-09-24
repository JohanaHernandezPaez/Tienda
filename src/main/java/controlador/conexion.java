package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import javax.swing.JOptionPane;

public class conexion {

	Connection cnn;

	public Connection conexionbd() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				cnn=DriverManager.getConnection("jdbc:mysql://localhost/tienda","root","G@m3z1996");
			//JOptionPane.showMessageDialog(null, "Conexion ok");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return cnn;

	}

}

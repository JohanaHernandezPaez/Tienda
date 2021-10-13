package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class conexion {

	Connection cnn;

	public Connection conexionbd() {
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Class.forName("org.mariadb.jdbc.Driver");
			try {
				//cnn=DriverManager.getConnection("jdbc:mysql://localhost/tienda","root","G@m3z1996");
				cnn=DriverManager.getConnection("jdbc:mariadb://tiendagenericagrupo43-10-32.czo3ixoe3xoe.us-east-1.rds.amazonaws.com/Toreto_tienda","admin","123456789");
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

package modelo;

import controlador.conexion;

import java.sql.*;

import javax.swing.JOptionPane;
public class ClientesDAO {
	
	ClientesDTO clientesDTO;
	conexion concli=new conexion();
    Connection cnn= concli.conexionbd();
	PreparedStatement ps;
	public boolean insertarcliente(ClientesDTO Cli) {
	int r;
    boolean dat=false;
    try {
        ps=cnn.prepareStatement("INSERT INTO clientes Values(?,?,?,?,?)");
        ps.setLong(1,Cli.getCedula_cliente());
        ps.setString(2,Cli.getDireccion_cliente());
        ps.setString(3,Cli.getEmail_cliente());
        ps.setString(4,Cli.getNombre_cliente());
        ps.setString(5,Cli.getTelefono_cliente());
        r=ps.executeUpdate();
        if(r>0) {
            dat=true;
        }
     } catch (SQLException e) {
        e.printStackTrace();
    }
    return dat;
}
	public ClientesDTO consultar(ClientesDTO cedula_cliente) {
		ResultSet rs;
		try {
			ps=cnn.prepareStatement("SELECT * FROM clientes WHERE cedula_cliente=?");
			ps.setLong(1, cedula_cliente.getCedula_cliente());
			rs=ps.executeQuery();
			if(rs.next()) {
				clientesDTO=new ClientesDTO(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5));
							}
			else {
				return null;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return clientesDTO;
	}
	
	//actualizar cliente
	
	public int actualizar(ClientesDTO cliente) {
		int x=0;
		try {
			ps=cnn.prepareStatement("UPDATE clientes SET direccion_cliente=?, email_cliente=?, nombre_cliente=?, telefono_cliente=? WHERE cedula_cliente=?");
			ps.setString(1, cliente.getDireccion_cliente());
			ps.setString(2, cliente.getEmail_cliente());
			ps.setString(3, cliente.getNombre_cliente());
			ps.setString(4, cliente.getTelefono_cliente());
			ps.setLong(5, cliente.getCedula_cliente());
			x=ps.executeUpdate();
				}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return x;
		
	}
	
	public int eliminar(ClientesDTO cliente) {
		int x=0;
		try {
			ps=cnn.prepareStatement("DELETE FROM clientes WHERE cedula_cliente=?");
			ps.setLong(1, cliente.getCedula_cliente());
			x=ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return x;
	}

	

}

package modelo;

import controlador.conexion;

import java.sql.*;
public class ClientesDAO {
	
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
	
	

}

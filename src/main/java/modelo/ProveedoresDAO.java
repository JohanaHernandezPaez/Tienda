package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import controlador.conexion;

public class ProveedoresDAO {

	conexion concli=new conexion();
    Connection cnn= concli.conexionbd();
	PreparedStatement ps;
	public boolean insertarproveedor(ProveedoresDTO Provee) {
	int r;
    boolean dat=false;
    try {
        ps=cnn.prepareStatement("INSERT INTO proveedores Values(?,?,?,?,?)");
        ps.setLong(1,Provee.getNitproveedor() );
        ps.setString(2,Provee.getNombre_proveedor());
        ps.setString(3,Provee.getDireccion_proveedor());
        ps.setString(4,Provee.getTelefono_proveedor());
        ps.setString(5,Provee.getCiudad_proveedor());
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

package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controlador.conexion;

public class ProveedoresDAO {

	ProveedoresDTO proveedoresDTO;
	conexion conpro=new conexion();
    Connection cnn= conpro.conexionbd();
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
	public ProveedoresDTO consultar(ProveedoresDTO nitproveedor) {
		ResultSet rs;
		try {
			ps=cnn.prepareStatement("SELECT * FROM proveedores WHERE nitproveedor=?");
			ps.setLong(1, nitproveedor.getNitproveedor());
			rs=ps.executeQuery();
			if(rs.next()) {
				proveedoresDTO=new ProveedoresDTO(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5));
											}
			else {
				return null;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return proveedoresDTO;
	}
	//actualizar proveedor
	
		public int actualizar(ProveedoresDTO proveedores) {
			int x=0;
			try {
				ps=cnn.prepareStatement("UPDATE proveedores SET nombre_proveedor=?, direccion_proveedor=?, telefono_proveedor=?, ciudad_proveedor=?  WHERE nitproveedor=?");
				ps.setString(1, proveedores.getNombre_proveedor());
				ps.setString(2,proveedores.getDireccion_proveedor());
				ps.setString(3, proveedores.getTelefono_proveedor());
				ps.setString(4, proveedores.getCiudad_proveedor());
				ps.setLong(5, proveedores.getNitproveedor());		
				x=ps.executeUpdate();
					}
			catch(SQLException e) {
				e.printStackTrace();
			}
			return x;
			
		}
		
		public int eliminar(ProveedoresDTO proveedores) {
			int x=0;
			try {
				ps=cnn.prepareStatement("DELETE FROM proveedores WHERE nitproveedor=?");
				ps.setLong(1, proveedores.getNitproveedor());
				x=ps.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return x;
		}
	
	
}

package tests.persistencia;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




import javax.persistence.EntityManager;


import org.junit.BeforeClass;
import org.junit.Test;

import friki.tienda.com.Persistencia.Articulo;
import friki.tienda.com.Persistencia.ConnectionHelper;

public class ArticuloTest {

	static EntityManager em;
	Articulo articulo=null;
	
	@BeforeClass
	public static void setUp() throws Exception {
		

		em=ConnectionHelper.getInstance().getEntityManager();
		Articulo articulo=null;
    	String sql = "SELECT * FROM articulos " ;
       Connection conn = ConnectionHelper.getInstance().getConnection();
           
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
       rs.next();
       articulo = new Articulo();
       articulo.setIdArticulo(rs.getInt("id_articulo"));
	   	articulo.setNombre(rs.getString("nombre"));
	   	articulo.setDescripcion(rs.getString("descripcion"));
	   	articulo.setPrecio(rs.getDouble("precio"));
	   	articulo.setStock(rs.getInt("stock"));
	   	articulo.setCategoria(rs.getString("categoria"));
	   	articulo.setTipoDeProducto(rs.getString("tipo_de_producto"));
	   	articulo.setNovedad(rs.getString("novedad"));
    }
	@Test
	public void testGetEntityManager() {
		assert(ConnectionHelper.getInstance().getEntityManager()!=null);
	}
	@Test
	public void testArticulo() {
		 Articulo articulo2=null;
	    	String sql = "SELECT * FROM articulos ";
	        try (Connection conn = ConnectionHelper.getInstance().getConnection()){
	           
	            PreparedStatement ps = conn.prepareStatement(sql);
	            
	            ResultSet rs = ps.executeQuery();
	           rs.next();
	           articulo2 = new Articulo();
	           articulo2.setIdArticulo(rs.getInt("id_articulo"));
	           articulo2.setNombre(rs.getString("nombre"));
	           articulo2.setDescripcion(rs.getString("descripcion"));
	           articulo2.setPrecio(rs.getDouble("precio"));
	           articulo2.setStock(rs.getInt("stock"));
	           articulo2.setCategoria(rs.getString("categoria"));
	           articulo2.setTipoDeProducto(rs.getString("tipo_de_producto"));
	           articulo2.setNovedad(rs.getString("novedad"));
	         
	        } catch (SQLException e) {
	        	fail("SQLException: "+ e.getMessage()); // TODO
	          
			}
	        assert(articulo2!=null);
		
	}

	@Test
	public void testGetIdArticulo() {
		assert( articulo.getIdArticulo()>0);
	}
	
	@Test
	public void testGetNombre() {
		assert( articulo.getNombre()!=null && !articulo.getNombre().isEmpty());
	}


	@Test
	public void testSetIdArticulo() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetCategoria() {
		assert( articulo.getCategoria()!=null && !articulo.getCategoria().isEmpty()); // TODO
	}

	@Test
	public void testSetCategoria() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetDescripcion() {
		assert( articulo.getDescripcion()!=null && !articulo.getDescripcion().isEmpty()); // TODO
	}

	@Test
	public void testSetDescripcion() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetImagen() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetImagen() {
		fail("Not yet implemented"); // TODO
	}


	@Test
	public void testSetNombre() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetPrecio() {
		assert(articulo.getPrecio()>=0); // TODO
	}

	@Test
	public void testSetPrecio() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetStock() {
		assert(articulo.getStock()>=0); // TODO
	}

	@Test
	public void testSetStock() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetTipoDeProducto() {
		assert( articulo.getTipoDeProducto()!=null && !articulo.getTipoDeProducto().isEmpty()); // TODO
	}

	@Test
	public void testSetTipoDeProducto() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetLineaspedidos() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetLineaspedidos() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testAddLineaspedido() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testRemoveLineaspedido() {
		fail("Not yet implemented"); // TODO
	}

}

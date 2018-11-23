package Controlador;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Modelo.*;

public class dB_Conn {

	
	
	 private Connection connect() {
	        // SQLite connection string
		 String url = "jdbc:sqlite:test.db";
	        Connection conn = null;
	        try {
	            conn = DriverManager.getConnection(url);
	            //System.out.print(conn.isValid(timeout));
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	        return conn;
	    }
	 
	    /**
	     * Create a new material and add initial quantity to the warehouse
	     *
	     * @param material
	     * @param warehouseId
	     * @param qty
	     */
	 public void insert(String name, double capacity) {
	        String sql = "INSERT INTO Jugador(nombre,infuence) VALUES(?,?)";
	 
	        try (Connection conn = this.connect();
	        		 
	                PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setString(1, name);
	            pstmt.setDouble(2, capacity);
	            pstmt.executeUpdate();
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	 
	 
	 public void selectAll(){
	        String sql = "SELECT id, nombre, infuence FROM Jugador";
	        
	        try (Connection conn = this.connect();
	             Statement stmt  = conn.createStatement();
	             ResultSet rs    = stmt.executeQuery(sql)){
	            
	            // loop through the result set
	            while (rs.next()) {
	                System.out.println(rs.getInt("id") +  "\t" + 
	                                   rs.getString("nombre") + "\t" +
	                                   rs.getDouble("infuence"));
	            }
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	 
	 
	 
	 public void update(int id, String name, double capacity) {
	        String sql = "UPDATE Jugador SET nombre = ? , "
	                + "infuence = ? "
	                + "WHERE id = ?";
	 
	        try (Connection conn = this.connect();
	                PreparedStatement pstmt = conn.prepareStatement(sql)) {
	 
	            // set the corresponding param
	            pstmt.setString(1, name);
	            pstmt.setDouble(2, capacity);
	            pstmt.setInt(3, id);
	            // update 
	            pstmt.executeUpdate();
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	 
	 
	 public void delete(int id) {
	        String sql = "DELETE FROM Jugador WHERE id = ?";
	 
	        try (Connection conn = this.connect();
	                PreparedStatement pstmt = conn.prepareStatement(sql)) {
	 
	            // set the corresponding param
	            pstmt.setInt(1, id);
	            // execute the delete statement
	            pstmt.executeUpdate();
	 
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	 
	  
	 
	 public Jugador get_player(String name, String Contraseña){
	        String sql = "SELECT  id,nombre,infuence, contrasena FROM Jugador where (nombre==? and contrasena==?)  ";
	        Jugador jugador = null;
	        
	        try (Connection conn = this.connect();
	                PreparedStatement pstmt  = conn.prepareStatement(sql)){
	               
	               // set the value
	               pstmt.setString(1,name);
	               pstmt.setString(2,Contraseña);
	               //
	               ResultSet rs  = pstmt.executeQuery();
	               
	               // loop through the result set
	               while (rs.next()) {
		                System.out.println(rs.getInt(1) +  "\t" + 
		                                   rs.getString("nombre") + "\t" +
		                                   rs.getDouble("infuence"));
		                jugador= new Jugador(rs.getInt("id"), rs.getString("nombre"),rs.getString("contrasena"),"",rs.getInt("infuence"));
		            }
	           } catch (SQLException e) {
	               //System.out.println(e.getMessage());
	               return null;
	           }
	    
	        return jugador;
	 }
	 
	 
	 public Jugador get_retos_aceptados(Jugador jugador){
	        String sql = "select r.Id ,r.Estado,r.Tipo ,r.IMG, r.description   from retos r inner join retos_aceptados a on a.id_player=? and r.id=a.id   ";
	        List<Reto> Li_re_en_curso = new ArrayList<Reto>();
	         
	         
	        
	        try (Connection conn = this.connect();
	                PreparedStatement pstmt  = conn.prepareStatement(sql)){
	               
	               // set the value
	               pstmt.setInt(1,jugador.getId());
	               
	               //
	               ResultSet rs  = pstmt.executeQuery();
	               
	               // loop through the result set
	               while (rs.next()) {
	            	   
		                System.out.println(rs.getInt(1) +  "\t" + 
		                                   rs.getString(2) + "\t" +
		                                   rs.getDouble(3));
		                
		                Li_re_en_curso.add(new Reto(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5)));
		            }
	           } catch (SQLException e) {
	               return null;
	           }
	    
	        jugador.setLi_re_en_curso(Li_re_en_curso);
	        return jugador;
	 }
	 
	 public Jugador get_retos_Creados(Jugador jugador){
	        String sql = "select r.Id ,r.nombre,r.Estado,r.Tipo ,r.IMG, r.description   from retos r inner join retos_aceptados a on a.id_player=? and r.id=a.id   ";
	        List<Reto> Li_re_en_curso = new ArrayList<Reto>();
	         
	         
	        
	        try (Connection conn = this.connect();
	                PreparedStatement pstmt  = conn.prepareStatement(sql)){
	               
	               // set the value
	               pstmt.setInt(1,jugador.getId());
	               
	               //
	               ResultSet rs  = pstmt.executeQuery();
	               
	               // loop through the result set
	               while (rs.next()) {
	            	   
		                System.out.println(rs.getInt(1) +  "\t" + 
		                                   rs.getString(2) + "\t" +
		                                   rs.getDouble(3));
		                
		                Li_re_en_curso.add(new Reto(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6)));
		            }
	           } catch (SQLException e) {
	               return null;
	           }
	    
	        jugador.setLi_re_en_curso(Li_re_en_curso);
	        return jugador;
	 }
	 
	 
	 public Jugador get_retos_calificados(Jugador jugador){
	        String sql = "select r.Id ,r.nombre,r.Estado,r.Tipo ,r.IMG, r.description   from retos r inner join retos_aceptados a on a.id_player!=? and r.id=a.id   ";
	        List<Reto> li_re_calificados = new ArrayList<Reto>();
	         
	         
	        
	        try (Connection conn = this.connect();
	                PreparedStatement pstmt  = conn.prepareStatement(sql)){
	               
	               // set the value
	               pstmt.setInt(1,jugador.getId());
	               
	               //
	               ResultSet rs  = pstmt.executeQuery();
	               
	               // loop through the result set
	               while (rs.next()) {
	            	   
		                System.out.println(rs.getInt(1) +  "\t" + 
		                                   rs.getString(2) + "\t" +
		                                   rs.getDouble(3));
		                
		                li_re_calificados.add(new Reto(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6)));
		            }
	           } catch (SQLException e) {
	               return null;
	           }
	    
	        jugador.setLi_re_calificados((ArrayList<Reto>) li_re_calificados);
	        return jugador;
	 }
	 
	 
	 public Jugador get_tareas_per_reto(Jugador jugador){
	        
		 List<Reto> Li_re_en_curso = new ArrayList<Reto>();
		 String sql = "select t.id,t.Descripcion,t.Fecha_de_finalizacion,t.Fecha_Ingreso, t.Nombre, t.Influence from Tarea t where t.Id_Retos=?   ";
		   
	         
		 Li_re_en_curso=jugador.getLi_re_en_curso();    
	        
		 
		 for (Reto a : Li_re_en_curso) 
		 { 
			 List<Tarea> t = new ArrayList<Tarea>();
			 try (Connection conn = this.connect();
		                PreparedStatement pstmt  = conn.prepareStatement(sql)){
		               
		               // set the value
		               pstmt.setInt(1,a.getId());
		               
		               //
		               ResultSet rs  = pstmt.executeQuery();
		               
		               // loop through the result set
		               while (rs.next()) {
		            	   
		            	   t.add(new Tarea (rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getDate(4),rs.getString(5), rs.getInt(6)));  
		            	   //System.out.println(rs.getInt(1));
		               }
		               a.setTareas(t);
		               
		           } catch (SQLException e) {
		               return null;
		           }
		    
		 }
		 
	        
	        jugador.setLi_re_en_curso(Li_re_en_curso);
	        return jugador;
	 }
	 
	 
	 
	 public void insert_new_user(String name,String contrasena,double capacity) {
	        String sql = "INSERT INTO Jugador(nombre,contrasena,infuence) VALUES(?,?,?)";
	 
	        try (Connection conn = this.connect();
	        		 
	                PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setString(1, name);
	            pstmt.setString(2, contrasena);
	            pstmt.setDouble(3, 0);
	            pstmt.executeUpdate();
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	 
	 
	 
	 
	 /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	 
	    	dB_Conn app = new dB_Conn();
	    	Jugador j= new Jugador();
	        j= app.get_player("juan","olaola1");
	        j=app.get_retos_aceptados(j);
	        j=app.get_tareas_per_reto(j);
	        j=app.get_retos_calificados(j);
	        System.out.println(j.getLi_re_calificados());
	    	
	    } 

}
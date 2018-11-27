package Controlador;
import Vista.*;
import Vista.Tarea;
import Modelo.*;

import java.awt.EventQueue;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class Controlador {
 
	
	
	//vistas
	private Login login_view; 
	private Register register_view;
	private Friends friend_views;
	private Menu menu_view;
	private Mision mision_view;
	private Tarea tarea;
	private My_Misions test2_view;
	
	
	//controladores
	private dB_Conn db ;
	private int count=0;
  
	//Modelos
	private Jugador j;
	private Amigos fds;
	
 
 //test
 public  int pepe;
	
	 Controlador(){
	db= new dB_Conn();
	j= new Jugador();
		 
		 
	login_view = new Login(this);
	login_view.setVisible(true);
	
	 
	}
	
	 
	 //Funcion del Boton Login
	 /*esta funcion lo que hace es primero preguntar si el usuario existe en la base, retorna null si no es cierto */
	 public void Login_action_B_login(String name, String password){
		 System.out.println(name+" "+password);
		 if(db.get_player(name, password) != null){
			 j=db.get_player(name, password); //funcion para consultar tabla jugador
			 j=db.get_retos_aceptados(j); //funcion para consultar la tabal de retos aceptados usando el id del jugador
			 j=db.get_tareas_per_reto(j); //funcion para rellenar las tareas de los retos
			 j=db.get_retos_calificados(j);
			 j=db.selectAll_player_friends(j);
			 menu_view = new Menu(this,this.j);  //Los SetVisibles es la forma en como cambio de vistas
			 login_view.setVisible(false);
			 menu_view.setVisible(true);
			 
			 menu_view.setPlayer_name(new JLabel(j.getName()));
			 
		 }else{
			 
			 JOptionPane.showMessageDialog(null, "Usuario o contraseña no Validos");
		 }
		
	 }
	 
	 //Funcion del Boton register del Login
	 public void Login_action_B_register(){
			 register_view= new Register(this);
			 register_view.setVisible(true);
			 login_view.setVisible(false);
		 }
	 
	 public void Register_action_B_register(String name, String password){
		 
		 if(db.get_player(name, password) == null){
			 db.insert_new_user(name, password, 0);
			 login_view.setVisible(true);
			 register_view.setVisible(false);
			 
		 }else{
			 
			 JOptionPane.showMessageDialog(null, "Error El usuario ya Existe");
		 }
		 
	 }
		 
	 public void Menu_action_B_GoMision(){
		
		 	if(!j.getLi_re_en_curso().isEmpty()){
		 	test2_view = new My_Misions(this, j) ;
		 	test2_view.setVisible(true);
		 	}else{
		 		JOptionPane.showMessageDialog(null, "No hay Retos que Terminar");
		 	}
			 
		 }	 
	 
	 public void Menu_action_B_Friends(){
			
		 	friend_views = new Friends(this, j);
		 	friend_views.setVisible(true);
			 
		 }	 
		 
		 
		
	 public void My_Misions_action_B_Terminar(/*Reto a*/ int index){
		 	
		 
		 	if(j.getLi_re_en_curso().isEmpty()){
		 		test2_view.dispose();
		 	}else
		 	{
		 	this.j.getLi_re_en_curso().get(index).setEstado(2);
		 	db.reto_update(this.j.getLi_re_en_curso().get(index));
		 	this.j.getLi_re_en_curso().remove(index);
		 	test2_view.dispose();	
		 	test2_view = new My_Misions(this,j);
		 	test2_view.setVisible(true);
		 	}
		 	
		 	
		 	//test2_view.removeAll();
			 
		 }	 
	 
	 
	 public void Menu_action_B_Like_Dislike(int n){
		 
		 count+=n;
		 if(count > j.getLi_re_calificados().size()){
			 
		 }
		 else if(count < 0){
			 
		 }
		 	System.out.println(j);
		 
			 menu_view.setPlayer_name(new JLabel("pepe"));
			 //menu_view.setInfluence(new JLabel(""+j.getInfluencie()));
			 
		 
			/* try {
					menu_view.setUrl(new URL(j.getLi_re_calificados().get(count).getImg()));
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
				 
			 }*/
			 
	 }
	 
	

}

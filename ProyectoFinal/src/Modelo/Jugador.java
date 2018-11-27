package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
	private int Id;
	private String Name;
	private String Contraseña;
	private String Fecha_Nacimiento;
	private int Influencie;
	
	private ArrayList<Reto> Li_re_calificados;
	private ArrayList<Reto> Li_re_espera;
	private ArrayList<Reto> Li_re_en_curso =null;
	private ArrayList<Reto> Li_re_fin;
	private ArrayList<Amigos> Fiends;
	
	
	
	
	
	
	public ArrayList<Amigos> getFiends() {
		return Fiends;
	}


	public void setFiends(ArrayList<Amigos> fiends) {
		Fiends = fiends;
	}


	public ArrayList<Reto> getLi_re_calificados() {
		return Li_re_calificados;
	}


	public void setLi_re_calificados(ArrayList<Reto> li_re_calificados) {
		Li_re_calificados = li_re_calificados;
	}


	public void setLi_re_en_curso(ArrayList<Reto> li_re_en_curso) {
		Li_re_en_curso = li_re_en_curso;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public Jugador(int id,String name, String contraseña, String fecha_Nacimiento, int influencie, ArrayList<Reto> li_re_espera,
			ArrayList<Reto> li_re_en_curso, ArrayList<Reto> li_re_fin) {
		super();
		Id=id;
		Name = name;
		Contraseña = contraseña;
		Fecha_Nacimiento = fecha_Nacimiento;
		Influencie = influencie;
		Li_re_espera = li_re_espera;
		Li_re_en_curso = li_re_en_curso;
		Li_re_fin = li_re_fin;
	}
	
	
	@Override
	public String toString() {
		return "Jugador [Id=" + Id + ", Name=" + Name + ", Contraseña=" + Contraseña + ", Fecha_Nacimiento="
				+ Fecha_Nacimiento + ", Influencie=" + Influencie + ", Li_re_calificados=" + Li_re_calificados
				+ ", Li_re_espera=" + Li_re_espera + ", Li_re_en_curso=" + Li_re_en_curso + ", Li_re_fin=" + Li_re_fin
				+ ", Fiends=" + Fiends + "]";
	}


	public Jugador(int id ,String name, String contraseña, String fecha_Nacimiento, int influencie)
	{
			
		super();
		Id=id;
		Name = name;
		Contraseña = contraseña;
		Fecha_Nacimiento = fecha_Nacimiento;
		Influencie = influencie;
	
	}
	
	public Jugador() {
		super();
	
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getContraseña() {
		return Contraseña;
	}


	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}


	public String getFecha_Nacimiento() {
		return Fecha_Nacimiento;
	}


	public void setFecha_Nacimiento(String fecha_Nacimiento) {
		Fecha_Nacimiento = fecha_Nacimiento;
	}


	public int getInfluencie() {
		return Influencie;
	}


	public void setInfluencie(int influencie) {
		Influencie = influencie;
	}


	public ArrayList<Reto> getLi_re_espera() {
		return Li_re_espera;
	}


	public void setLi_re_espera(ArrayList<Reto> li_re_espera) {
		Li_re_espera = li_re_espera;
	}


	public ArrayList<Reto> getLi_re_en_curso() {
		return Li_re_en_curso;
	}


	public void setLi_re_en_curso(List<Reto> li_re_en_curso2) {
		Li_re_en_curso = (ArrayList<Reto>) li_re_en_curso2;
	}


	public ArrayList<Reto> getLi_re_fin() {
		return Li_re_fin;
	}


	public void setLi_re_fin(ArrayList<Reto> li_re_fin) {
		Li_re_fin = li_re_fin;
	}

	
	

}

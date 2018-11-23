package Modelo;

import java.util.List;

public class Retos_calificados {

	private int id;
	@Override
	public String toString() {
		return "Retos_calificados [id=" + id + ", id_reto=" + id_reto + ", id_jugador=" + id_jugador + ", img=" + img
				+ ", description=" + description + "]";
	}
	private int id_reto;
	private int id_jugador;
	private String img;
	private String description;
	
	public Retos_calificados() {
		super();
	}
	public Retos_calificados(int id, int id_reto, int id_jugador, String img, String description) {
		super();
		this.id = id;
		this.id_reto = id_reto;
		this.id_jugador = id_jugador;
		this.img = img;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_reto() {
		return id_reto;
	}
	public void setId_reto(int id_reto) {
		this.id_reto = id_reto;
	}
	public int getId_jugador() {
		return id_jugador;
	}
	public void setId_jugador(int id_jugador) {
		this.id_jugador = id_jugador;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}

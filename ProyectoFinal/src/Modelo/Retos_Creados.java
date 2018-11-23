	package Modelo;

public class Retos_Creados {
	private int id;
	private int id_player;
	private int id_reto;
	
	public Retos_Creados() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Retos_Creados(int id, int id_player, int id_reto) {
		super();
		this.id = id;
		this.id_player = id_player;
		this.id_reto = id_reto;
	}
	@Override
	public String toString() {
		return "Retos_Creados [id=" + id + ", id_player=" + id_player + ", id_reto=" + id_reto + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_player() {
		return id_player;
	}
	public void setId_player(int id_player) {
		this.id_player = id_player;
	}
	public int getId_reto() {
		return id_reto;
	}
	public void setId_reto(int id_reto) {
		this.id_reto = id_reto;
	}

}

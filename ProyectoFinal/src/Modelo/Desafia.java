package Modelo;

public class Desafia {
	private int  id;
	private int  id_player;
	private int  id_retador;
	private boolean estado;
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
	public int getId_retador() {
		return id_retador;
	}
	public void setId_retador(int id_retador) {
		this.id_retador = id_retador;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Desafia(int id, int id_player, int id_retador, boolean estado) {
		super();
		this.id = id;
		this.id_player = id_player;
		this.id_retador = id_retador;
		this.estado = estado;
	}
	public Desafia() {
		super();
	}
	@Override
	public String toString() {
		return "Desafia [id=" + id + ", id_player=" + id_player + ", id_retador=" + id_retador + ", estado=" + estado
				+ "]";
	}
	
	
	
	
	
	
}

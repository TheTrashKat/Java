package Modelo;

import java.util.List;

public class Reto {
	
	private int id;
	private String nombre;
	private int estado;
	private int tipo;
	private String img;
	private String description;
	
	private List<Tarea> Tareas;

	
	public Reto(int id, String nombre, int estado, int tipo, String img, String description) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.estado = estado;
		this.tipo = tipo;
		this.img = img;
		this.description = description;
	}

	public Reto(int id, String nombre, int estado, int tipo, String img, String description, List<Tarea> tareas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.estado = estado;
		this.tipo = tipo;
		this.img = img;
		this.description = description;
		Tareas = tareas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public Reto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reto(int id, int estado, int tipo, String img, String description, List<Tarea> tareas) {
		super();
		this.id = id;
		this.estado = estado;
		this.tipo = tipo;
		this.img = img;
		this.description = description;
		Tareas = tareas;
	}

	public Reto(int id, int estado, int tipo, String img, String description) {
		super();
		this.id = id;
		this.estado = estado;
		this.tipo = tipo;
		this.img = img;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
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

	public List<Tarea> getTareas() {
		return Tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		Tareas = tareas;
	}

	@Override
	public String toString() {
		return "Reto [id=" + id + ", nombre=" + nombre + ", estado=" + estado + ", tipo=" + tipo + ", img=" + img
				+ ", description=" + description + ", Tareas=" + Tareas + "]";
	}


	
	
}

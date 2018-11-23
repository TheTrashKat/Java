package Modelo;

import java.sql.Date;

public class Tarea {
	
	private int id;
	private String description;
	private Date fecha_ingreso ;
	private Date fecha_exp ;
	private String nombre;
	private int influence;
	
	@Override
	public String toString() {
		return "Tarea [id=" + id + ", description=" + description + ", fecha_ingreso=" + fecha_ingreso + ", fecha_exp="
				+ fecha_exp + ", nombre=" + nombre + ", influence=" + influence + "]";
	}

	public Tarea(int id, String description, Date fecha_ingreso, Date fecha_exp, String nombre, int influence) {
		super();
		this.id = id;
		this.description = description;
		this.fecha_ingreso = fecha_ingreso;
		this.fecha_exp = fecha_exp;
		this.nombre = nombre;
		this.influence = influence;
	}

	public Tarea() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public Date getFecha_exp() {
		return fecha_exp;
	}

	public void setFecha_exp(Date fecha_exp) {
		this.fecha_exp = fecha_exp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getInfluence() {
		return influence;
	}

	public void setInfluence(int influence) {
		this.influence = influence;
	}

	

}

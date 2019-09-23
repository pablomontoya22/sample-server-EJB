package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuarios
 *
 */
@Entity

public class Usuarios implements Serializable {

	   
	@Id
	private int id;
	private String nombre;
	private String apellido;
	private String pass;
	private Date creation;
	private static final long serialVersionUID = 1L;

	public Usuarios() {
		super();
	}   
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}   
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}   
	public String getApellido() {
		return this.apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}   
	public String getPass() {
		return this.pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Date getCreation() {
		return creation;
	}
	public void setCreation(Date creation) {
		this.creation = creation;
	}
}

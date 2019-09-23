package entities;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Libro
 *
 */
@Entity
public class Libro implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private Date creacion;
	private Double precio;
	private static final long serialVersionUID = 1L;

	public Libro() {
		super();
	}

	public Libro(Long id, String nombre, Date creacion, Double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.creacion = creacion;
		this.precio = precio;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getCreacion() {
		return this.creacion;
	}
	public void setCreacion(Date creacion) {
		this.creacion = creacion;
	}
	public Double getPrecio() {
		return this.precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("{id=%d, nombre=%s, creacion=%s, precio=%.2f}", id, nombre, creacion.toString(), precio);
	}
}

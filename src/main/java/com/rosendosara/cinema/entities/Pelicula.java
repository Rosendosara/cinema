package com.rosendosara.cinema.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="cinema")
public class Pelicula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titulo;
	private String sinopsis;
	private int fecha_estreno;
	private String imagen;
	private String video;
	
	public Pelicula() {
		super();
	}

	public Pelicula(int id, String titulo, String sinopsis, int fecha_estreno, String imagen, String video) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.fecha_estreno = fecha_estreno;
		this.imagen = imagen;
		this.video = video;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public int getFecha_estreno() {
		return fecha_estreno;
	}

	public void setFecha_estreno(int fecha_estreno) {
		this.fecha_estreno = fecha_estreno;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}
	
	
}
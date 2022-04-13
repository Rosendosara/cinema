package com.rosendosara.cinema.services;

import java.util.List;

import com.rosendosara.cinema.entities.Pelicula;

public interface ICinemaService {
	public List<Pelicula> findAll();
}

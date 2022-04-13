package com.rosendosara.cinema.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosendosara.cinema.entities.Pelicula;
import com.rosendosara.cinema.repos.ICinemaRepo;

@Service
public class CinemaServiceImp implements  ICinemaService {

	@Autowired
	ICinemaRepo cinemaRepo;
	
	@Override
	public List<Pelicula> findAll() {
		List<Pelicula> peliculas= cinemaRepo.findAll();
		return peliculas;
	}

}

package com.rosendosara.cinema.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rosendosara.cinema.entities.Pelicula;
import com.rosendosara.cinema.services.ICinemaService;

@CrossOrigin(origins ="*", allowedHeaders = "*")
@RestController 
public class RestCinemaController {
	@Autowired
	ICinemaService cinemaService;
	
	
	@GetMapping(path="/peliculas", produces= {MediaType.APPLICATION_JSON_VALUE})
	List<Pelicula> getPeliculas(){
		return cinemaService.findAll();
	}
	
	
}

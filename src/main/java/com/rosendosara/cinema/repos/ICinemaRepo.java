package com.rosendosara.cinema.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosendosara.cinema.entities.Pelicula;


public interface ICinemaRepo extends JpaRepository<Pelicula, Integer>  {

}

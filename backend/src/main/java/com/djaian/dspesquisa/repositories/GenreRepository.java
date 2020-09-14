package com.djaian.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djaian.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}

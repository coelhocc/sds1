package com.djaian.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djaian.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}

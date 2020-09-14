package com.djaian.dspesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.djaian.dspesquisa.dto.GameDTO;
import com.djaian.dspesquisa.entities.Game;
import com.djaian.dspesquisa.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameDTO> findAll() {
		List<Game> list = repository.findAll();
		//Stream() transforma a lista em uma stream que aceita funções de alta ordem
		return list.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
	}
}

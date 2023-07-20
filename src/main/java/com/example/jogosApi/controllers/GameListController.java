package com.example.jogosApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jogosApi.dto.GameListDTO;
import com.example.jogosApi.dto.GameMinDTO;
import com.example.jogosApi.services.GameListService;
import com.example.jogosApi.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findall(){
		List<GameListDTO> result =  gameListService.findaAll();
		return result; 
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		List<GameMinDTO> result =  gameService.findByLIst(listId);
		return result; 
	}
}

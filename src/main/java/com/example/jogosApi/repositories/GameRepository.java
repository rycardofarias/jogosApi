package com.example.jogosApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jogosApi.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}

package com.example.jogosApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jogosApi.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}

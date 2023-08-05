package com.skilldistillery.mw2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.mw2.entities.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}

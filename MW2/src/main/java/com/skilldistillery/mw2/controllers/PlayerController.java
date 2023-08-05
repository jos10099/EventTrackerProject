package com.skilldistillery.mw2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.mw2.entities.Player;
import com.skilldistillery.mw2.services.PlayerService;

@RestController
@RequestMapping("api")
public class PlayerController {

	@Autowired
	private PlayerService playerService;
	
	
	@GetMapping("players")
	List<Player> listPlayers() {
		return playerService.listAllPlayers();
	}
}

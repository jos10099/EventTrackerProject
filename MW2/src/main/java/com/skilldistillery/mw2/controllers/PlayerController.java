package com.skilldistillery.mw2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.mw2.entities.Player;
import com.skilldistillery.mw2.services.PlayerService;

@CrossOrigin({"*", "http://localhost/"})
@RestController
@RequestMapping("api")
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@GetMapping("players")
	List<Player> listPlayers() {
		return playerService.listAllPlayers();
	}

	@PostMapping("players")
	Player addPlayer(@RequestBody Player newPlayer) {
		return playerService.create(newPlayer);
	}

	@GetMapping("players/{playerId}")
	Player getPlayerById(@PathVariable int playerId) {
		return playerService.getPlayer(playerId);
	}

	@PutMapping("players/{playerId}")
	Player updatePlayer(@PathVariable int playerId, @RequestBody Player updatedPlayer) {
		return playerService.update(playerId, updatedPlayer);
	}

	@DeleteMapping("players/{playerId}")
	boolean deletePlayer(@PathVariable int playerId) {
		return playerService.delete(playerId);
	}

}

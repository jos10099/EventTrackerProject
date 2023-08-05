package com.skilldistillery.mw2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.skilldistillery.mw2.entities.Player;
import com.skilldistillery.mw2.repositories.PlayerRepository;

@Service
public class PlayersServiceImpl implements PlayerService {
	
	@Autowired
	private PlayerRepository playerRepo;

	@Override
	public List<Player> listAllPlayers() {
		// TODO Auto-generated method stub
		return playerRepo.findAll();
	}

	@Override
	public Player getPlayer(int playerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player creat(Player newPlayer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player update(int playerId, Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int playerId) {
		// TODO Auto-generated method stub
		return false;
	}

}

package com.skilldistillery.mw2.services;
import java.util.List;

import com.skilldistillery.mw2.entities.Player;

public interface PlayerService {
	List <Player> listAllPlayers();
	Player getPlayer(int playerId);
	Player creat(Player newPlayer);
	Player update(int playerId, Player player);
	boolean delete(int playerId);

}

package com.skilldistillery.mw2.services;

import java.util.List;
import java.util.Optional;

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
        return playerRepo.findAll();
    }

    @Override
    public Player getPlayer(int playerId) {
        Optional<Player> optionalPlayer = playerRepo.findById(playerId);
        return optionalPlayer.orElse(null);
    }

    @Override
    public Player create(Player newPlayer) {
        return playerRepo.save(newPlayer);
    }

    @Override
    public Player update(int playerId, Player player) {
        Optional<Player> optionalPlayer = playerRepo.findById(playerId);
        if (optionalPlayer.isPresent()) {
            Player existingPlayer = optionalPlayer.get();
            existingPlayer.setUsername(player.getUsername());
            existingPlayer.setWeapon(player.getWeapon());
            existingPlayer.setFavoritePerk(player.getFavoritePerk());
            existingPlayer.setOperatorSkin(player.getOperatorSkin());
            existingPlayer.setLevel(player.getLevel());
            return playerRepo.save(existingPlayer);
        }
        return null;
    }

    @Override
    public boolean delete(int playerId) {
        Optional<Player> optionalPlayer = playerRepo.findById(playerId);
        if (optionalPlayer.isPresent()) {
            playerRepo.delete(optionalPlayer.get());
            return true;
        }
        return false;
    }
}

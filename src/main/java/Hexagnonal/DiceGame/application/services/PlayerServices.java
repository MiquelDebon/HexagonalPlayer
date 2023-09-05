package Hexagnonal.DiceGame.application.services;

import Hexagnonal.DiceGame.domain.model.Player;
import Hexagnonal.DiceGame.domain.ports.in.UsesPlayer;

import java.util.List;
import java.util.Optional;

public class PlayerServices implements UsesPlayer {

    private final UsesPlayer usesPlayer;

    public PlayerServices(UsesPlayer usesPlayer) {
        this.usesPlayer = usesPlayer;
    }

    @Override
    public Player createPlayer(Player player) {
        return usesPlayer.createPlayer(player);
    }
    @Override
    public Boolean deletePlayer(int playerId) {
        return usesPlayer.deletePlayer(playerId);
    }

    @Override
    public Optional<Player> findPlayerById(int playerId) {
        return usesPlayer.findPlayerById(playerId);
    }

    @Override
    public List<Player> findAllPlayers() {
        return usesPlayer.findAllPlayers();
    }

    @Override
    public Optional<Player> updatePlayer(int playerId, Player updatedPlayer) {
        return usesPlayer.updatePlayer(playerId, updatedPlayer);
    }
}

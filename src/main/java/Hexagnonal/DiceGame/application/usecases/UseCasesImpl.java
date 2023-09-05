package Hexagnonal.DiceGame.application.usecases;

import Hexagnonal.DiceGame.domain.model.Player;
import Hexagnonal.DiceGame.domain.ports.in.UsesPlayer;
import Hexagnonal.DiceGame.domain.ports.out.PlayerRepositoryPort;

import java.util.List;
import java.util.Optional;

public class UseCasesImpl implements UsesPlayer {

    private final PlayerRepositoryPort playerRepositoryPort;

    public UseCasesImpl(PlayerRepositoryPort playerRepository) {
        this.playerRepositoryPort = playerRepository;
    }


    @Override
    public Player createPlayer(Player player) {
        return playerRepositoryPort.save(player);
    }

    @Override
    public Boolean deletePlayer(int playerId) {
        return playerRepositoryPort.deleteById(playerId);
    }

    @Override
    public Optional<Player> findPlayerById(int playerId) {
        return playerRepositoryPort.findById(playerId);
    }

    @Override
    public List<Player> findAllPlayers() {
        return playerRepositoryPort.findAll();
    }

    @Override
    public Optional<Player> updatePlayer(int playerId, Player updatedPlayer) {
        return playerRepositoryPort.update(playerId, updatedPlayer);
    }
}

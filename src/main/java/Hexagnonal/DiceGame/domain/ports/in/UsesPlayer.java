package Hexagnonal.DiceGame.domain.ports.in;

import Hexagnonal.DiceGame.domain.model.Player;

import java.util.List;
import java.util.Optional;

public interface UsesPlayer {
    Player createPlayer(Player player);
    Boolean deletePlayer(int playerId);
    Optional<Player> findPlayerById(int playerId);
    List<Player> findAllPlayers();
    Optional<Player> updatePlayer(int playerId, Player updatedPlayer);

}

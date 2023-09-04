package Hexagnonal.DiceGame.domain.ports.in;

import Hexagnonal.DiceGame.domain.model.Player;

public interface UsesPlayer {
    Player createPlayer(Player player);
    void deletePlayer(int playerId);

}

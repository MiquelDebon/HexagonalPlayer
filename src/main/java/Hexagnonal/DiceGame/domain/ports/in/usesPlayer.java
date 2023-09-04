package Hexagnonal.DiceGame.domain.ports.in;

import Hexagnonal.DiceGame.domain.model.Player;

public interface usesPlayer {
    Player createPlayer(Player player);
    void deletePlayer(int playerId);

}

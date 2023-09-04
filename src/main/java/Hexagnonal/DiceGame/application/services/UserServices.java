package Hexagnonal.DiceGame.application.services;

import Hexagnonal.DiceGame.domain.model.Player;
import Hexagnonal.DiceGame.domain.ports.in.UsesPlayer;

public class UserServices implements UsesPlayer {

    private UsesPlayer usesPlayer;

    public UserServices(UsesPlayer usesPlayer) {
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
}

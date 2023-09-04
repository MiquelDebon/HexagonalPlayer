package Hexagnonal.DiceGame.domain.ports.out;

import Hexagnonal.DiceGame.domain.model.Player;

import java.util.List;

public interface playerRepositoryPort {
    List<Player> findAll();
    Player findById(Integer id);
    Player save(Player player);
    Player update(Player player);
    Boolean deleteById(Integer id);
}

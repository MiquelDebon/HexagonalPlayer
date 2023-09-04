package Hexagnonal.DiceGame.domain.ports.out;

import Hexagnonal.DiceGame.domain.model.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerRepositoryPort {
    List<Player> findAll();
    Optional<Player> findById(Integer id);
    Player save(Player player);
    Optional<Player>  update(Player player);
    Boolean deleteById(Integer id);
}

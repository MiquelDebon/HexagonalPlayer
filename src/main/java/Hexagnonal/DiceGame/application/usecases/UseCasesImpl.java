package Hexagnonal.DiceGame.application.usecases;

import Hexagnonal.DiceGame.domain.model.Player;
import Hexagnonal.DiceGame.domain.ports.out.PlayerRepositoryPort;

import java.util.List;
import java.util.Optional;

public class UseCasesImpl implements PlayerRepositoryPort {

    private final PlayerRepositoryPort playerRepository;

    public UseCasesImpl(PlayerRepositoryPort playerRepository) {
        this.playerRepository = playerRepository;
    }


    @Override
    public List<Player> findAll() {
        return playerRepository.findAll();
    }
    @Override
    public Optional<Player> findById(Integer id) {
        return playerRepository.findById(id);
    }
    @Override
    public Player save(Player player) {
        return playerRepository.save(player);
    }
    @Override
    public Optional<Player> update(Player player) {
        return playerRepository.update(player);
    }
    @Override
    public Boolean deleteById(Integer id) {
        return playerRepository.deleteById(id);
    }
}

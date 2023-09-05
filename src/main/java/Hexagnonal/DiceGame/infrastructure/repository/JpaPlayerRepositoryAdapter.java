package Hexagnonal.DiceGame.infrastructure.repository;

import Hexagnonal.DiceGame.domain.model.Player;
import Hexagnonal.DiceGame.domain.ports.out.PlayerRepositoryPort;
import Hexagnonal.DiceGame.infrastructure.entities.PlayerEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaPlayerRepositoryAdapter implements PlayerRepositoryPort {

    private JpaPlayerRepository jpaPlayerRepository;

    public JpaPlayerRepositoryAdapter(JpaPlayerRepository jpaPlayerRepository) {
        this.jpaPlayerRepository = jpaPlayerRepository;
    }


    @Override
    public List<Player> findAll() {
        return jpaPlayerRepository.findAll().stream()
                .map(PlayerEntity::toDomainModel)
                .collect(Collectors.toList());
    }
    @Override
    public Optional<Player> findById(Integer id) {
        return jpaPlayerRepository.findById(id)
                .map(PlayerEntity::toDomainModel);
    }
    @Override
    public Player save(Player player) {
        PlayerEntity playerEntity = PlayerEntity.fromDomainModel(player);
        return jpaPlayerRepository.save(playerEntity).toDomainModel();
    }
    @Override
    public Optional<Player> update(int id, Player player) {
        if(!jpaPlayerRepository.existsById(id)) return Optional.empty();

        PlayerEntity playerEntity = PlayerEntity.fromDomainModel(
                new Player(
                    id,
                    player.getName(),
                    player.getEmail())
        );
        return Optional.of(jpaPlayerRepository.save(playerEntity).toDomainModel());
    }
    @Override
        public Boolean deleteById(Integer id) {
        if(jpaPlayerRepository.existsById(id)) {
            jpaPlayerRepository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }


}

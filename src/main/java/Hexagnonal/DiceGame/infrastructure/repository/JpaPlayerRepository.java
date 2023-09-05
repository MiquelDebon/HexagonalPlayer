package Hexagnonal.DiceGame.infrastructure.repository;

import Hexagnonal.DiceGame.infrastructure.entities.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaPlayerRepository extends JpaRepository<PlayerEntity, Integer> {}

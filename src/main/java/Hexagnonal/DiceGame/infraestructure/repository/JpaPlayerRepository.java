package Hexagnonal.DiceGame.infraestructure.repository;

import Hexagnonal.DiceGame.infraestructure.entities.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaPlayerRepository extends JpaRepository<PlayerEntity, Integer> {}

package Hexagnonal.DiceGame.infraestructure.entities;

import Hexagnonal.DiceGame.domain.model.Player;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;

    public static PlayerEntity fromDomainModel(Player player) {
        return new PlayerEntity(player.getId(), player.getName(), player.getEmail());
    }

    public Player toDomainModel() {
        return new Player(id, name, email);
    }


}

package Hexagnonal.DiceGame.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {
    private int id;
    private String name;
    private String email;
}

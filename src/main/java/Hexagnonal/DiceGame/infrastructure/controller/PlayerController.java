package Hexagnonal.DiceGame.infrastructure.controller;

import Hexagnonal.DiceGame.application.services.UsesPlayer;
import Hexagnonal.DiceGame.domain.model.Player;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/player")
public class PlayerController {
    private final UsesPlayer playerServices;

    public PlayerController(UsesPlayer playerServices) {
        this.playerServices = playerServices;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPlayerById(@PathVariable int id){
        Optional<Player> player = playerServices.findPlayerById(id);
        if(player.isPresent()){
            return ResponseEntity.ok(player.get());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<?> getAllPlayers(){
        return ResponseEntity.ok(playerServices.findAllPlayers());
    }

    @PostMapping
    public ResponseEntity<?> createPlayer(@RequestBody Player player){
        return ResponseEntity.ok(playerServices.createPlayer(player));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updatePlayer(
            @PathVariable int id,
            @RequestBody Player updatedPlayer)
    {
        Optional<Player> optionalPlayer = playerServices.updatePlayer(id, updatedPlayer);
        if(optionalPlayer.isPresent()){
            return ResponseEntity.ok(optionalPlayer.get());
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePlayer(@PathVariable int id){
        Boolean deleted = playerServices.deletePlayer(id);
        if(deleted){
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }



}

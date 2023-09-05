package Hexagnonal.DiceGame.infraestructure.config;

import Hexagnonal.DiceGame.application.services.PlayerServices;
import Hexagnonal.DiceGame.application.usecases.UseCasesImpl;
import Hexagnonal.DiceGame.domain.ports.out.PlayerRepositoryPort;
import Hexagnonal.DiceGame.infraestructure.repository.JpaPlayerRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public PlayerServices userServices(PlayerRepositoryPort playerRepositoryPort){
        return new PlayerServices(new UseCasesImpl(playerRepositoryPort));
    }

    @Bean PlayerRepositoryPort playerRepositoryPort(JpaPlayerRepositoryAdapter jpaPlayerRepositoryAdapter){
        return jpaPlayerRepositoryAdapter;
    }

}

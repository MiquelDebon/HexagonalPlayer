package Hexagnonal.DiceGame.infrastructure.config;

import Hexagnonal.DiceGame.application.services.AppUserServices;
import Hexagnonal.DiceGame.application.services.UsesPlayer;
import Hexagnonal.DiceGame.domain.ports.PlayerRepositoryPort;
import Hexagnonal.DiceGame.infrastructure.repository.JpaPlayerRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean AppUserServices beanAppUserServices(final JpaPlayerRepositoryAdapter playerRepositoryPort ){
        return new AppUserServices(playerRepositoryPort);
    }


}

package br.com.sara.api.config;

import br.com.sara.api.domain.User;
import br.com.sara.api.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void startDB() {
        User u1 = new User(null, "Santos", "santos@email.com", "123");
        User u2 = new User(null, "Maria", "maria@email.com", "456");

        repository.saveAll(List.of(u1,u2));
    }
}

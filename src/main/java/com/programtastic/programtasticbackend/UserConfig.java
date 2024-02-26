package com.programtastic.programtasticbackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            User johnDoe = new User(
                    1L,
                    "jdoe17",
                    "John",
                    "Doe",
                    "johndoe@gmail.com",
                    "passwordHash",
                    "Argentina",
                    LocalDate.of(2000, JANUARY, 5),
                    LocalDate.of(2005, APRIL, 23)
            );

            User alexDoe = new User(
                    2L,
                    "adoe3",
                    "Alex",
                    "Doe",
                    "alexdoe@gmail.com",
                    "passwordHash",
                    "United States",
                    LocalDate.of(2007, MARCH, 11),
                    LocalDate.of(2015, SEPTEMBER, 29)
            );

            repository.saveAll(
                    List.of(johnDoe, alexDoe)
            );
        };
    }

}

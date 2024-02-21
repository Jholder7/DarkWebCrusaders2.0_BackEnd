package com.programtastic.programtasticbackend;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class UserService {
    public List<User> getUsers(){
        return List.of(
                new User(
                        1,
                        "userName",
                        "John",
                        "Doe",
                        "johndoe@gmail.com",
                        "passwordHash",
                        "Argentina",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        LocalDate.of(2005, Month.APRIL, 23)
                )
        );
    }
}
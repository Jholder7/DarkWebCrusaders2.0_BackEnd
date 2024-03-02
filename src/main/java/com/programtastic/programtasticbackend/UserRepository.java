package com.programtastic.programtasticbackend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("Select user FROM User user WHERE user.email = ?1")
    Optional<User> findUserByEmail(String email);

    // **currently researching so its liable to change**
    // should add user to db after filling in user info with registrationRequest
    Optional<User> createUser();
}

package com.programtastic.programtasticbackend;

import com.programtastic.programtasticbackend.auth.requests.RegisterRequest;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    // need to add more constraints for validity in creating users
    public void registerUser(RegisterRequest registerRequest) {
        Optional<User> userOptionalEmail = userRepository.findUserByEmail(registerRequest.getEmail());
        if (userOptionalEmail.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        User user = new User(registerRequest);
        userRepository.save(user);
    }

    public void deleteUser(Long userID) {
        boolean exists = userRepository.existsById(userID);
        if (!exists) {
            throw new IllegalStateException("user with id " + userID + "does not exist");
        }
        userRepository.deleteById(userID);
    }

    // updateUser method
    @Transactional
    public void updateUser(Long userID,
                           String fName,
                           String lName,
                           String email) {
        User user = userRepository.findById(userID)
                .orElseThrow(() -> new IllegalStateException(
                        "student with id " + userID + " does not exist"
                ));

        if (fName != null &&
                !fName.isEmpty() &&
                !Objects.equals(user.getfName(), fName)) {
            user.setfName(fName);
        }

        if (lName != null &&
                !lName.isEmpty() &&
                !Objects.equals(user.getlName(), lName)) {
            user.setlName(lName);
        }

        if (email != null &&
                !email.isEmpty() &&
                !Objects.equals(user.getEmail(), email)) {
            Optional<User> userOptional = userRepository
                    .findUserByEmail(email);
            if (userOptional.isPresent()) {
                throw new IllegalStateException("email taken");
            }
            user.setEmail(email);
        }
    }
}
package com.programtastic.programtasticbackend;

import com.programtastic.programtasticbackend.auth.requests.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public void registerUser(@RequestBody RegisterRequest registerRequest) {
        userService.registerUser(registerRequest);
    }

    // need to ensure is non-null
    @DeleteMapping(path = "{userID}")
    public void deleteUser(@PathVariable("userID") Long userID) {
        userService.deleteUser(userID);
    }

    @PutMapping(path = "{userID}")
    public void updateUser(
            @PathVariable("userID") Long userID,
            @RequestParam(required = false) String fName,
            @RequestParam(required = false) String lName,
            @RequestParam(required = false) String email) {
        userService.updateUser(userID, fName, lName, email);
    }
}
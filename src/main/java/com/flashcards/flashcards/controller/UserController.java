package com.flashcards.flashcards.controller;
import com.flashcards.flashcards.model.User;
import com.flashcards.flashcards.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController{
    private final UserRepository userRepository;
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostMapping("/signup")
    public User signup(@RequestBody User user){
        return userRepository.save(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User loginUser){
        User user = userRepository.findByUsername(loginUser.getUsername());
        if(user != null && user.getPassword().equals(loginUser.getPassword())){
            return user;
        }
        return null;
    }
}
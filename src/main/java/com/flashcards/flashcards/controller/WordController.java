package com.flashcards.flashcards.controller;
import com.flashcards.flashcards.model.User;
import com.flashcards.flashcards.model.Word;
import com.flashcards.flashcards.repository.UserRepository;
import com.flashcards.flashcards.service.WordService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/words")
@CrossOrigin(origins = "*")
public class WordController{
    private final WordService wordService;
    private final UserRepository userRepository;
    public WordController(WordService wordService, UserRepository userRepository){
        this.wordService = wordService;
        this.userRepository = userRepository;
    }

    @PostMapping("/{userId}")
    public Word addWord(@PathVariable Long userId, @RequestBody Word word){
        User user = userRepository.findById(userId).orElse(null);
        word.setUser(user);
        return wordService.addWord(word);
    }
    @GetMapping("/user/{userId}")
    public List<Word> getWordsByUser(@PathVariable Long userId){
        return wordService.getWordsByUser(userId);
    }
    @GetMapping("/random/{userId}")
    public Word getRandomWord(@PathVariable Long userId){
        return wordService.getRandomWord(userId);
    }
}
package com.flashcards.flashcards.service;
import com.flashcards.flashcards.model.Word;
import com.flashcards.flashcards.repository.WordRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Random;

@Service
public class WordService{
    private final WordRepository wordRepository;
    private final Random random = new Random();
    public WordService(WordRepository wordRepository){
        this.wordRepository = wordRepository;
    }
    public Word addWord(Word word){
        return wordRepository.save(word);
    }
    public List<Word> getWordsByUser(Long userId){
        return wordRepository.findByUserId(userId);
    }
    public Word getRandomWord(Long userId){
        List<Word> words = wordRepository.findByUserId(userId);
        if (words.isEmpty()){
            return null;
        }
        return words.get(random.nextInt(words.size()));
    }
}
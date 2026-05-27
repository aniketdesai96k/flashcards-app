package com.flashcards.flashcards.repository;

import com.flashcards.flashcards.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WordRepository
        extends JpaRepository<Word, Long> {

    List<Word> findByUserId(Long userId);
}
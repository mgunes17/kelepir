package org.word.service;

import org.word.model.Word;

import java.util.List;

/**
 * Created by mustafa on 08.03.2017.
 */
public interface WordService {
    void save(Word word);
    List<Word> allWords();
}

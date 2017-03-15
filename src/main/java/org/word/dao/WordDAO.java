package org.word.dao;

import org.word.model.Word;

import java.util.List;

/**
 * Created by mustafa on 08.03.2017.
 */
public interface WordDAO {
    void save(Word word);
    List<Word> getAllWords();
}

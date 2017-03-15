package org.word.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.word.dao.WordDAO;
import org.word.model.Word;
import org.word.service.WordService;

import java.util.List;


/**
 * Created by mustafa on 08.03.2017.
 */

@Service
public class WordServiceImpl implements WordService {
    private WordDAO wordDAO;

    @Transactional
    public void save(Word word) {
        wordDAO.save(word);
    }

    @Transactional
    public List<Word> allWords() {
        return wordDAO.getAllWords();
    }

    public void setWordDAO(WordDAO wordDAO) {
        this.wordDAO = wordDAO;
    }
}

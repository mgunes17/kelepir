package org.word.dao;

import org.word.model.Meaning;

import java.util.List;

/**
 * Created by mustafa on 14.03.2017.
 */
public interface MeaningDAO {
    void saveMeaning(Meaning meaning);
    List<Meaning> getAllMeanings();
}

package org.word.service;

import org.word.model.Meaning;

import java.util.List;

/**
 * Created by mustafa on 14.03.2017.
 */
public interface MeaningService {
    void save(Meaning meaning);
    List<Meaning> allMeanings();
}

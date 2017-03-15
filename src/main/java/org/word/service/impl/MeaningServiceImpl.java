package org.word.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.word.dao.MeaningDAO;
import org.word.model.Meaning;
import org.word.service.MeaningService;

import java.util.List;

/**
 * Created by mustafa on 14.03.2017.
 */

@Service
public class MeaningServiceImpl implements MeaningService {
    private MeaningDAO meaningDAO;

    @Transactional
    public void save(Meaning meaning) {
        meaningDAO.saveMeaning(meaning);
    }

    @Transactional
    public List<Meaning> allMeanings() {
        return meaningDAO.getAllMeanings();
    }

    public MeaningDAO getMeaningDAO() {
        return meaningDAO;
    }

    public void setMeaningDAO(MeaningDAO meaningDAO) {
        this.meaningDAO = meaningDAO;
    }
}

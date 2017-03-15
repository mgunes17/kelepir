package org.word.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.word.dao.ExampleDAO;
import org.word.model.Example;
import org.word.service.ExampleService;

/**
 * Created by mustafa on 14.03.2017.
 */

@Service
public class ExampleServiceImpl implements ExampleService {
    private ExampleDAO exampleDAO;

    @Transactional
    public void saveExample(Example example) {
        exampleDAO.saveExample(example);
    }

    //getter-setter
    public ExampleDAO getExampleDAO() {
        return exampleDAO;
    }

    public void setExampleDAO(ExampleDAO exampleDAO) {
        this.exampleDAO = exampleDAO;
    }
}

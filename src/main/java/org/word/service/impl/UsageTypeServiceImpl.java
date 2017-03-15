package org.word.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.word.dao.UsageTypeDAO;
import org.word.model.UsageType;
import org.word.service.UsageTypeService;

import java.util.List;

/**
 * Created by mustafa on 10.03.2017.
 */

@Service
public class UsageTypeServiceImpl implements UsageTypeService {
    private UsageTypeDAO usageTypeDAO;

    @Transactional
    public List<UsageType> allUsageTypes() {
        return usageTypeDAO.getAllUsageTypes();
    }

    @Transactional
    public UsageType getUsageType(String name) {
        return usageTypeDAO.getUsageType(name);
    }

    public void setUsageTypeDAO(UsageTypeDAO usageTypeDAO) {
        this.usageTypeDAO = usageTypeDAO;
    }
}

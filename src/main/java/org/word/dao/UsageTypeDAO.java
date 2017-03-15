package org.word.dao;

import org.word.model.UsageType;

import java.util.List;

/**
 * Created by mustafa on 10.03.2017.
 */
public interface UsageTypeDAO {
    List<UsageType> getAllUsageTypes();
    UsageType getUsageType(String name);
}

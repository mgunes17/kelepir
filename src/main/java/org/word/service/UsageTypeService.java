package org.word.service;

import org.word.model.UsageType;

import java.util.List;

/**
 * Created by mustafa on 10.03.2017.
 */
public interface UsageTypeService {
    List<UsageType> allUsageTypes();
    UsageType getUsageType(String name);
}

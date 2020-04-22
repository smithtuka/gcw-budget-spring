package com.galbern.budget.service.Impl;

import com.galbern.budget.dao.StageDao;
import com.galbern.budget.service.StageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StageServiceImpl implements StageService {
    @Autowired
    private StageDao stageDao;

}

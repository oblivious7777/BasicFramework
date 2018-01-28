package com.ob.service.impl;

import com.ob.dao.CategoryDao;
import com.ob.service.BasicService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class BasicServiceImpl  implements BasicService{

    @Resource
    CategoryDao categoryDao;

    public int list(){
        return categoryDao.list();
    }
}

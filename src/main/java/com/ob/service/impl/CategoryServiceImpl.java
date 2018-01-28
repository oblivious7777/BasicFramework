package com.ob.service.impl;


import com.ob.dao.CategoryDao;
import com.ob.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl  implements CategoryService {
    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    CategoryDao categoryDao;


   public int list(){
    return categoryDao.list();
   }
}

package com.ob.dao;

import org.apache.ibatis.annotations.Select;

public interface CategoryDao {
    @Select("select count(*) from   student")
    public int list();//查询学生表

    public int listOfMapper();//查询学生表
}

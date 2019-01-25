package com.yang.dao;

import com.yang.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//@Mapper
public interface IAccountDao {
    @Select("select * from account")
    List<Account> findAll();
}

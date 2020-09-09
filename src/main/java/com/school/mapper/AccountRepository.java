package com.school.mapper;

import com.school.entity.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountRepository {

    int save(Account account);

    int delete(Integer id);

    List<Account> getAcounts(int age);

    List<Account> findAccount(@Param("account") Account account);

    List<Account> findAccount2(@Param("account") Account account);

    List<Account> findAccount3(@Param("account") Account account);

    int accountUpdate(@Param("account") Account account);

    int accountUpdate2(@Param("account") Account account);

    List<Account> findAccountsByIds(@Param("ids") List<Integer> ids) ;



}

package com.school.mapper;

import com.school.entity.Account;

import java.util.List;

public interface AccountRepository {

    int save(Account account);

    int delete(Integer id);

    List<Account> getAcounts(int age);

}

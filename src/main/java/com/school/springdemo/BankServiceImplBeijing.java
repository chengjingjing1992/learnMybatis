package com.school.springdemo;

import java.util.List;
import java.util.Set;

/**
 * @author chengjinging
 * @date 2020/8/15 下午9:11
 */
public class BankServiceImplBeijing implements BankService{

    

    private List<String> list;
    private Set set;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }
}

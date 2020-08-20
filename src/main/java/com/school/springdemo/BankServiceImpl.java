package com.school.springdemo;

import java.util.Date;
import java.util.List;

/**
 * @author chengjinging
 * @date 2020/8/15 下午8:06
 */
public class BankServiceImpl implements BankService{

    private int bankNo;
    private String bankName;
    private Date date;
    private List list;

    public int getBankNo() {
        return bankNo;
    }

    public void setBankNo(int bankNo) {
        this.bankNo = bankNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}

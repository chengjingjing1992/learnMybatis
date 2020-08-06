package com.school.mapper;

import com.school.entity.Customer;
import com.school.entity.CustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {

    int countByExample(CustomerExample example);


    int deleteByExample(CustomerExample example);


    int insert(Customer record);


    int insertSelective(Customer record);


    List<Customer> selectByExample(CustomerExample example);

    List<Customer> findAllCustomers();


    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);


    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);
}
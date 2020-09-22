package com.school.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chengjinging
 * @date 2020/9/13 下午2:33
 */
@Service
public class DemoService {

    @Autowired
    private DemoDao demoDao;

    public void demoService(){
        System.out.println("提供服务");
        demoDao.daoDemo();
    }


}

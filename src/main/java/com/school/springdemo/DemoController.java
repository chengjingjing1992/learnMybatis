package com.school.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author chengjinging
 * @date 2020/9/13 下午2:34
 */

@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;


    public void contollerDemo(){
        demoService.demoService();
    }


}

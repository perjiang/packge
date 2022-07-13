package com.jx.packge;

import com.jx.packge.controller.HelloController;
import com.jx.packge.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PackgeApplication.class)
class PackgeApplicationTests {


    @Autowired
    private HelloController controller;

    @Autowired
    private TestService testService;
    @Test
    void contextLoads() {
        controller.play();
    }
    @Test
    void test(){
        testService.test(100);
    }

}

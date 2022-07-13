package com.jx.packge.service;

import com.jx.packge.annotion.TestApi;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestService
 * @Description TODO
 * @Author
 * @Date 2022/7/13 17:29
 */

@Component
public class TestService {


    @TestApi
    public void test(int count){
        System.out.println(count);
    }
}

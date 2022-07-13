package com.jx.packge.controller;

import com.jx.packge.TtlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author
 * @Date 2022/7/8 11:02
 */


@RestController
public class HelloController {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Autowired
    TtlConfig ttlConfig;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("redis/{k}/{v}")
    public String redis(@PathVariable(value = "k") String key,@PathVariable(value = "v")String value){
        redisTemplate.opsForValue().set(key,value);
        return "ok";
    }

    @GetMapping("redis/{k}")
    public String redis(@PathVariable(value = "k")String key){
        return redisTemplate.opsForValue().get(key);
    }

    @GetMapping("/ttl")
    public String ttl(){
        return ttlConfig.toString();
    }

    public void play(){
        System.out.println("play");
    }
}

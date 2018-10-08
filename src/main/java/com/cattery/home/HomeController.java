package com.cattery.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping
    public String index() {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ops.set("name", "cattery");
        String value = ops.get("name");
        return "hello, "+value;
    }
}

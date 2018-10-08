package com.cattery.configration;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.PropertySource;

@SpringBootConfiguration
@PropertySource("classpath:redis.yml")
public class RedisConfig {
}

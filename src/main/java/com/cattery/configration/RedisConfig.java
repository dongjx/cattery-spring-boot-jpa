package com.cattery.configration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@SpringBootConfiguration
public class RedisConfig {
    @Autowired
    RedisClusterProperties clusterProperties;

    @Bean
    public RedisConnectionFactory redisConnectionFactory() {
        return new JedisConnectionFactory(new RedisClusterConfiguration(clusterProperties.getNodes()));
    }
}

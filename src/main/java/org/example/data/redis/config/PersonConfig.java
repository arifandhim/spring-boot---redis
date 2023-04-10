package org.example.data.redis.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.util.Map;

@Data
@Configuration
@Component("org.example.data.redis.config.PersonConfig")
public class PersonConfig {
    private Map<String, String> config;
    @Autowired
    public PersonConfig() {
        Jedis jedis = this.jedis();
        this.config=config(jedis);
    }
    @Bean
    public Jedis jedis() {
        return new Jedis("localhost", 6379);
    }
    public Map<String, String> config(Jedis jedis) {
        return jedis.hgetAll("test1");
    }
}

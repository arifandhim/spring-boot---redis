package org.example.data.redis;

import org.example.data.redis.config.PersonConfig;
import org.junit.Test;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = PersonConfig.class)
public class PersonConfigTest {

    @Autowired
    PersonConfig personConfig;

    @Before
    public void setUp() {
        personConfig = new PersonConfig();
    }

    @Test
    public void testConfig() {
        System.out.println(personConfig.getConfig().get("firstName"));
    }

}
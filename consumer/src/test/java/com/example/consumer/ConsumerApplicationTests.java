package com.example.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void hi() {
        userService.hi();
    }

    @Test
    public void hiAsync() {
        userService.hiAsync();
    }

}

package com.example.consumer;

import com.example.provider.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    GreetingService greetingService;

    @Override
    public void hi() {
        String result = greetingService.sayHello("hello dubbo");
        System.out.println(result);
    }
}

package com.example.consumer;

import com.example.api.AsyncGreetingService;
import com.example.api.GreetingService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class UserServiceImpl implements UserService {

    @Reference
    GreetingService greetingService;

    @Reference(timeout = 7000)
    AsyncGreetingService asyncGreetingService;

    @Override
    public void hi() {
        String result = greetingService.sayHello("hello dubbo");
        System.out.println(result);
    }

    @Override
    public void hiAsync() {
        System.out.println("method start.");
        CompletableFuture<String> future = asyncGreetingService.sayHello("async call method.");
        future.whenComplete((String result, Throwable t) -> {
            if (t != null) {
                t.printStackTrace();
            } else {
                System.out.println("callback result: " + result);
            }
        });
        System.out.println("method end.");
    }
}

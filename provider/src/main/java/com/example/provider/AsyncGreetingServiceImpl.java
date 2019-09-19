package com.example.provider;

import com.example.api.AsyncGreetingService;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Service
public class AsyncGreetingServiceImpl implements AsyncGreetingService {

    @Override
    public CompletableFuture<String> sayHello(String name) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return CompletableFuture.completedFuture(name);
    }
}

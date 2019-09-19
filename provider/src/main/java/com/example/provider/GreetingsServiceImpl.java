package com.example.provider;


import org.springframework.stereotype.Service;

@Service
public class GreetingsServiceImpl implements GreetingService {
    @Override
    public String sayHello(String name) {
        return "hi, " + name;
    }
}

package com.example.api;

import java.util.concurrent.CompletableFuture;

public interface AsyncGreetingService {

    CompletableFuture<String> sayHello(String name);
}

package com.example.provider.clusterfailure;

import com.example.api.clusterfailure.FailFastService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class FailFastServiceImpl implements FailFastService {

    @Override
    public void failFast() {
        System.out.println("================> failFast method be called.");
        try {
            TimeUnit.SECONDS.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

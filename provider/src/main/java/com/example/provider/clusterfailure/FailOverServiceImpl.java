package com.example.provider.clusterfailure;

import com.example.api.clusterfailure.FailOverService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class FailOverServiceImpl implements FailOverService {

    @Override
    public void failOver() {
        System.out.println("================> failOver method be called.");
        try {
            TimeUnit.SECONDS.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

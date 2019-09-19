package com.example.consumer;

import com.example.api.clusterfailure.FailFastService;
import com.example.api.clusterfailure.FailOverService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClusterFailTest {

    @Reference
    FailOverService failOverService;

    @Reference
    FailFastService failFastService;

    @Test
    public void failOver() {
        failOverService.failOver();
    }

    @Test
    public void failFast() { failFastService.failFast(); }
}

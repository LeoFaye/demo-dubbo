package com.example.api.clusterfailure;

public interface FailFastService {

    /**
     * 快速失败，只发起一次调用，失败立即报错。
     * 通常用于非幂等性的写操作，比如新增记录。
     */
    void failFast();
}

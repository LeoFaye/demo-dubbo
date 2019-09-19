package com.example.api.clusterfailure;

public interface FailOverService {

    /**
     * 失败换一台服务器重试，默认的模式
     */
    void failOver();
}

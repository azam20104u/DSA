package com.azam.dsa.InterviewBit;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConcurrentApi {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
       ExecutorService executor = Executors.newSingleThreadExecutor();
       Future<String> submit = executor.submit(()->{
            return "Hello from thread";
       });
       System.out.println(submit.get().toString());
    }
} 

package com.practice.ThirtyDaysChallenges;

import java.util.concurrent.*;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a fixed thread pool with 4 threads
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Submit tasks to the executor
        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);  // Simulate task execution time
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // Shutdown the executor after the tasks are done
        executor.shutdown();
    }
}


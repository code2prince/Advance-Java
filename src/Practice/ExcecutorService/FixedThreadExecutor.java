package Practice.ExcecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(3);
        try {
            for (int i = 0; i < 10; i++) {
                int taskId = i;
                executor.execute(() -> {
                    System.out.println("task: " + taskId + " executed by: " + Thread.currentThread().getName());
                });
            }
        }finally {
            executor.shutdown();
        }
    }
}

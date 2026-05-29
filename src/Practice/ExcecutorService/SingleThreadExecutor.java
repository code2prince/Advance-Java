package Practice.ExcecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        try{
            for(int i=0; i<5; i++){
                int taskId=i;

                executorService.execute(()->{
                    System.out.println("task "+ taskId+ " executed by "+ Thread.currentThread().getName());
                });
            }

        }finally {
            executorService.shutdown();
        }
    }
}

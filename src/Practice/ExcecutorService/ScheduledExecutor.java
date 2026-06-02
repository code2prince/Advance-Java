package Practice.ExcecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ScheduledExecutor {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler= Executors.newScheduledThreadPool(4);

//        AtomicInteger runCnt=new AtomicInteger(0);
//        scheduler.scheduleAtFixedRate(()->{
//            int currCount=
//        })
    }
}

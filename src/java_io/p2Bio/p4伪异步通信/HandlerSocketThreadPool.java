package java_io.p2Bio.p4伪异步通信;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author xm
 * @date 2021/10/5 12:44
 * @description:
 */
public class HandlerSocketThreadPool {
    private ExecutorService executorService;

    /**
     *     public ThreadPoolExecutor(int corePoolSize,
     int maximumPoolSize,
     long keepAliveTime,
     TimeUnit unit,
     BlockingQueue<Runnable> workQueue)
     */
    public HandlerSocketThreadPool() {
        this.executorService = new ThreadPoolExecutor(3, 10, 120, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10));
    }

    public void execute(Runnable task){
        this.executorService.execute(task);
    }


}


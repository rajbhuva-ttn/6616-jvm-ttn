package MultiThreading;

import java.lang.constant.Constable;
import java.util.concurrent.*;

class CallDemo implements Callable {

    @Override
    public Object call() throws Exception {
        return "call executed";
    }


}
class RunDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("inside Run method");
    }
}

public class Example4 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

//        Callable Example
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        CallDemo task1 = new CallDemo();
        Future result = executorService1.submit(task1);
        System.out.println(result.isDone());
        Thread.sleep(2000);
        System.out.println(result.isDone());
        System.out.println(result.get());

        executorService1.shutdown();

//        Runnable Example
        ExecutorService executorService2 = Executors.newCachedThreadPool();
        RunDemo task2 = new RunDemo();
        executorService2.execute(task2);

        Thread.sleep(1000);



    }
}

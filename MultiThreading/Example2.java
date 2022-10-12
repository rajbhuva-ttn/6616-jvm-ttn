package MultiThreading;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.*;

class ThreadExample extends Thread{

    void startPrint(){
        System.out.println("hello its "+ Thread.currentThread().getName());
    }

    void endPrint(){
        System.out.println("Bye "+ Thread.currentThread().getName());
    }

    @Override
    public void run() {
        startPrint();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        endPrint();
    }
}

public class Example2  {



    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor1 = Executors.newFixedThreadPool(2);
        ExecutorService executor2 = Executors.newCachedThreadPool();
        ExecutorService executor3 = Executors.newSingleThreadExecutor();


        for(int i = 0; i<10; i++){
            ThreadExample t = new ThreadExample();
            t.setName("T "+i);
            executor1.submit(t);
//            executor2.submit(t);
//            executor3.submit(t);
        }

        executor1.shutdown();
        executor2.shutdown();
        executor3.shutdown();


    }
}


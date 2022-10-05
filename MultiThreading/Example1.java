package MultiThreading;

import java.lang.management.RuntimeMXBean;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        MultiThreading runnable = new MultiThreading();
        Thread thread1 = new Thread(runnable,"Runnable Thread");
        thread1.start();
        thread1.sleep(1000);
        thread1.join();
        Threading thread = new Threading();
        thread.start();
        thread.join();


    }
}
class Threading extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
class MultiThreading implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is running");

    }

}

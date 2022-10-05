package MultiThreading;

public class Example2 {
    private Integer integer = 10;

    private void increment() {
        this.integer++;
    }

    private void decrement() {
        this.integer--;
    }

    public static void main(String[] args) throws InterruptedException {
        Example2 instanceMethodSynchronized = new Example2();
        Object lock = new Object();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 20000; i++) {
                synchronized (lock) {
                    instanceMethodSynchronized.increment();
                }
            }
        }, "IncrementThread");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 20000; i++) {
                synchronized (lock) {
                    instanceMethodSynchronized.decrement();
                }
            }
        }, "DecrementThread");
        t1.start();
        t2.start();
        t1.join();
        t2.join();


        Thread.sleep(1000);
        System.out.println(instanceMethodSynchronized.integer);
    }
}


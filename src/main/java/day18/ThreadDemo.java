package day18;

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(
                    Thread.currentThread().getName()
                            + " - Count: " + i
            );
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args)
            throws InterruptedException {

        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Both threads completed");
    }
}
package Mutlithreading;

public class MyThread extends Thread{
    public MyThread(String str) {
        super(str);
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println(Thread.currentThread().getName() + " Thread is running " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("First Thread.");
        MyThread t2 = new MyThread("Second Thread.");
        MyThread t3 = new MyThread("Third Thread.");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);


        t1.start();
        t2.start();
        t3.start();
       // t1.join(3000);
        System.out.println("Hello World");
    }

}

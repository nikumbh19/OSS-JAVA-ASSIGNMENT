package com.day8.session1.threads;

class MyJob implements Runnable{

    @Override
    public void run() {
        System.out.println("job is started:"+Thread.currentThread().getName());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" job is done:"+Thread.currentThread().getName());

    }

}
public class DemoThread {

    public static void main(String[] args) {
        System.out.println("starting the main: "+Thread.currentThread().getName());
        MyJob job=new MyJob();

        Thread thread1=new Thread(job, "A");
        Thread thread2=new Thread(job, "B");
        Thread thread3=new Thread(job, "C");

        Thread thread4=new Thread(job, "D");


        thread1.start();
        thread2.start();

        thread3.start();

        thread4.start();
        //for main thread , i thread1 join after thraed2
        try {
            thread1.join(1000);
            thread2.join(2000);
            thread3.join(1000, 2000);
            thread4.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("ending the main: "+Thread.currentThread().getName());

    }
 
}

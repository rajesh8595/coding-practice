package com.practice.skillTests;

public class ThreadExcution {
    public static void main(String[] args) {
        Runnable r1 = new MyThread();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
    class MyThread implements Runnable{
        @Override
        public void run() {
           for(int i=0;i<=10;i++){
               System.out.println(i);

               try{
                   Thread t1=new Thread();
                   t1.sleep(1000);
               }catch (InterruptedException e){
                   e.printStackTrace();
               }
           }
        }
    }

package org.batch.multithreading.threadbasicmethod.old.interview;

import lombok.SneakyThrows;

public class InterruptThreadRunner {
    @SneakyThrows
    public static void main(String[] args) {

        System.out.println("Code started by : " + Thread.currentThread().getName());


        Runnable countingTask = () -> {
          for(int i = 0; i < 5; i++){
              System.out.println("ThreadName :  " + Thread.currentThread().getName() + " : " +  ++i);
              try {
                  Thread.sleep(5000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        };
        Thread countingThread = new Thread(countingTask);
        countingThread.setName("countingThread");
        countingThread.start();

        Thread.sleep(2000);
        countingThread.interrupt();  // main-thread is waking up or interrupting the countingThread

        System.out.println("Code started by : " + Thread.currentThread().getName());

    }
}

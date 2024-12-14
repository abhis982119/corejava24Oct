package org.batch.multithreading.basics.waystocreateThread.extendsthread;

import lombok.SneakyThrows;

public class GreetingThread extends  Thread {

    @Override @SneakyThrows
   public void run(){
       for (int i = 0; i < 5; i++){
           System.out.println("Hello user at, " + System.currentTimeMillis());
           Thread.sleep(2000);
       }
   }
}

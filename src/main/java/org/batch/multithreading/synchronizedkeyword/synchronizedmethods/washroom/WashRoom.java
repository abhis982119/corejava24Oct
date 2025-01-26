package org.batch.multithreading.synchronizedkeyword.synchronizedmethods.washroom;

import lombok.SneakyThrows;

 public class WashRoom {

    public synchronized void useWashRoom(){
        userToiletSeat();
        userJetSpray();
    }
    @SneakyThrows
    public synchronized void userToiletSeat(){
        System.out.println(Thread.currentThread().getName() + ":  is using toiletseat");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + ":  is done with the business and left the toilet seat");
    }

    public void knockTheWashRoom(){
        System.out.println("Knock knock on washroom");
    }

    @SneakyThrows
    public synchronized void userJetSpray(){
        System.out.println(Thread.currentThread().getName() + ":  is using jetspray");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + ":  is done with jetspray");
    }

}

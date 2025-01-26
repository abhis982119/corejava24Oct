package org.batch.multithreading.waitandnotify.pc;

public class Runner {

    public static void main(String[] args) {
        PC pc  = new PC();

        Runnable produceTask = () -> pc.produce();
        Runnable consumeTask = () -> pc.consume();

       Thread producer =  new Thread(produceTask);
       producer.setName("Producer ");
       producer.start();


       Thread consumer =  new Thread(consumeTask);
       consumer.setName("Consumer");
       consumer.start();

    }
}

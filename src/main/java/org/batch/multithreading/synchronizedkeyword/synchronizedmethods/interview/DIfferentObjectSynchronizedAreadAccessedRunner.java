package org.batch.multithreading.synchronizedkeyword.synchronizedmethods.interview;

import org.batch.multithreading.synchronizedkeyword.synchronizedmethods.washroom.WashRoom;

public class DIfferentObjectSynchronizedAreadAccessedRunner {

    public static void main(String[] args) {
        WashRoom washRoom1 = new WashRoom();
        WashRoom washRoom2 = new WashRoom();



        Thread rahul = new Thread(() -> washRoom1.useWashRoom() );
        rahul.setName("rahul");

        Thread prakash = new Thread(() -> washRoom2.useWashRoom());
        prakash.setName("prakash");

     /*   Thread manish = new Thread(() -> washRoom2.useWashRoom());
        manish.setName("manish");*/

        rahul.start();
        prakash.start();
      //  manish.start();

    }
}

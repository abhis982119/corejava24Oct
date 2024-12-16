package org.batch.multithreading.synchronizedkeyword.basics.washroom;

public class WashRoomUsageRunner {

    public static void main(String[] args) {

        WashRoom washRoom = new WashRoom();

        Thread rahul = new Thread(() -> washRoom.useWashRoom() );
        rahul.setName("rahul");

        Thread prakash = new Thread(() -> washRoom.useWashRoom());
        prakash.setName("prakash");


        Thread manish = new Thread(() -> washRoom.useWashRoom());
        manish.setName("manish");


        rahul.start();
        prakash.start();
        manish.start();

    }

}

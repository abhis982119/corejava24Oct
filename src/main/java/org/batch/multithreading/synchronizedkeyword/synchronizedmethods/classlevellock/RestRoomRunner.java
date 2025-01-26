package org.batch.multithreading.synchronizedkeyword.synchronizedmethods.classlevellock;

public class RestRoomRunner {

    public static void main(String[] args) {

        WashBasin washBasin = new WashBasin();
        HandDryer handDryer = new HandDryer();

        RestRoom restRoom = new RestRoom(washBasin,handDryer);

        Runnable useTheWashBasinTask = () -> restRoom.userWashBasin();
        Runnable useHandDryerTask = () -> restRoom.useHandDryer();



        Thread adam = new Thread(useTheWashBasinTask);
        adam.setName("adam");
        Thread eve = new Thread(useTheWashBasinTask);
        eve.setName("eve");

        Thread naresh = new Thread(useHandDryerTask);
        naresh.setName("naresh");


        adam.start();
        eve.start();
        naresh.start();
    }
}

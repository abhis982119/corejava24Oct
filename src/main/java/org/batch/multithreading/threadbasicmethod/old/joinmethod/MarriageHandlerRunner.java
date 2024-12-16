package org.batch.multithreading.threadbasicmethod.old.joinmethod;

import lombok.SneakyThrows;

public class MarriageHandlerRunner {

    @SneakyThrows
    public static void main(String[] args) {

        Thread brideGroomMeetTask = new Thread( () -> System.out.println("Bride and Groom meet"));
        Thread parentsMeetTask = new Thread(() -> System.out.println("Bride Groom parents meet"));
        Thread astrologerTask = new Thread(() ->System.out.println("Astrologer find auspacious date"));
        Thread banquetHallBookingTask = new Thread(() -> System.out.println("Brother booked banquet hall"));
        Thread brigeGroomBuyingClothesTask = new Thread(() -> System.out.println("Bride groom buying clothes for marraige"));
        Thread cardPrintTask = new Thread(() -> System.out.println("Uncle will print cards"));
        Thread invitingGuestTask = new Thread(()-> System.out.println("Parents will invite the guest"));
        Thread marriageTask = new Thread(()->System.out.println("Marriage successfully completes"));


        brideGroomMeetTask.start();
        brideGroomMeetTask.join();   // currentThread will wait, until the thread on which join is used gets completed.


        parentsMeetTask.start();
        parentsMeetTask.join();

        astrologerTask.start();
        astrologerTask.join();


        brigeGroomBuyingClothesTask.start();
        banquetHallBookingTask.start();

        banquetHallBookingTask.join();


        cardPrintTask.start();
        cardPrintTask.join();


        invitingGuestTask.start();
        invitingGuestTask.join();

        marriageTask.start();

    }
}

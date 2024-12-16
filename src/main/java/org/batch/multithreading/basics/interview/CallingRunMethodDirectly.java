package org.batch.multithreading.basics.interview;

import org.batch.multithreading.basics.model.CountingTask;
import org.batch.multithreading.basics.model.PrintNameTask;

public class CallingRunMethodDirectly {

    public static void main(String[] args) {

        CountingTask task = new CountingTask();
        Thread thread = new Thread(task);
        thread.run();

        PrintNameTask nameTask = new PrintNameTask();
        Thread printNameThread = new Thread(nameTask);
        printNameThread.run();
    }
}

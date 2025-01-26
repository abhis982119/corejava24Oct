package org.batch.multithreading.basics.shutdownhooks;

import java.sql.SQLOutput;

public class ShutdownHookRunner {


    public static void main(String[] args) {
        int databaseConnections = 0;

        Runtime runtime =   Runtime.getRuntime();

        Runnable dbConnectionsReleaseTask = () ->{
          for(int i = databaseConnections; i > 0; i--){
                System.out.println("Releaseing connection number : " + i);
            }
        };
        Thread releaseDBConnection = new Thread(dbConnectionsReleaseTask);

        Thread closeAllOpenFiles = new Thread(() -> System.out.println("closing all opened file"));

        runtime.addShutdownHook(releaseDBConnection);
        runtime.addShutdownHook(closeAllOpenFiles);



        System.out.println(" line-1");
        System.out.println(" line-2");
        System.out.println(" line-3");
    //    System.exit(1);   // shutdown the jvm
        System.out.println(" line-4");
        System.out.println(" line-5");

        System.out.println("closing database connections : " + databaseConnections);
        System.out.println("main thread ends");

    }

}

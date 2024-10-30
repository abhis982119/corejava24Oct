package org.batch.stringmanipulation.stringbuilder;

public class Runner {


    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("https://");
        builder.append("www.youtube.com");
        builder.append("/feed/history");

        builder.append("?username=youtubeuser");
        builder.append("&password=pass");


        System.out.println(builder);
    }
}

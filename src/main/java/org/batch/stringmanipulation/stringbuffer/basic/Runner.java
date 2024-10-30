package org.batch.stringmanipulation.stringbuffer.basic;

public class Runner {


    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("https://");
        sb.append("www.youtube.com");
        sb.append("/feed/history");

        System.out.println(sb);
    }
}

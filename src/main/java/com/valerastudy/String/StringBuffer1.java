package com.valerastudy.String;

public class StringBuffer1 {

    private final static int MAX_LENGHT = 30;
    private static String buffer = "";
    private static final int N = 100;

    public static void main(String[] args) {
        countTo_N_Improved();
        // iata dece nu imprima restul cifrelor "buffer.length() + nextChunk.length() > MAX_LENGHT" nu se indeplineste
        // System.out.println(buffer);
    }

    private static void emit(String nextChunk) {
        if (buffer.length() + nextChunk.length() > MAX_LENGHT) {
            System.out.println(buffer);
            buffer = "";
        }
        buffer += nextChunk;
    }

    private static void countTo_N_Improved() {
        for (int count = 2; count <= N; count = count + 2) {
            emit(" " + count);
        }
    }
}

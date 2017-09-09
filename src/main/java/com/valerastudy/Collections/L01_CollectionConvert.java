package com.valerastudy.Collections;

import com.valerastudy.Array.L01_SortAndSearch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class L01_CollectionConvert {
    public static void main(String[] args) {
        //Ex 1 Convert Array to Collection
///////////////////////////////////////////////////////////////////////////////////////////
        try {
            arrayToCollection();
        } catch (IOException e) {
        }

    }

    //Ex 1 First and last element
///////////////////////////////////////////////////////////////////////////////////////////


    public static void arrayToCollection() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many elements you want to add to the array: ");
        int n = Integer.parseInt(in.readLine());
        String[] name = new String[n];

        System.out.println("Insert arrays elements: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Element [%d]: ", i);
            name[i] = in.readLine();
        }

        List<String> list = Arrays.asList(name);

//        System.out.println("Collections elements as List<String>: ");
//        for (String li : list) {
//            String str = li;
//            System.out.print(str + " ");
//        }
        L01_SortAndSearch1.printArray("Collections elements as List<String>", list.toArray());
    }

}

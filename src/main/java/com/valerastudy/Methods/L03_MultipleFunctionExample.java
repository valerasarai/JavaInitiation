package com.valerastudy.Methods;

import com.valerastudy.Array.L01_SortAndSearch1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import static java.math.BigInteger.*;

public class L03_MultipleFunctionExample {
    //Fibonacci 1
    public static List<Long> fibonacci(int number) {
        List<Long> list = new ArrayList<Long>();
        if (number == 0) {
            list.add(0L);
            return list;
        }
        if (number == 1) {
            list.add(0L);
            list.add(1L);
            return list;
        }
        if (number > 1) {
            list.add(0L);
            list.add(1L);

            for (int i = 2; i < number; i++) {
                list.add(list.get(i - 1) + list.get(i - 2));
            }
        }
        return list;
    }

    //Factorial
    public static BigInteger factorial(BigInteger n){
        if (n.intValue() <= 1) return ONE;
        else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }

    public static void dysplayObjectClass(Object o){
        if (o instanceof Vector) System.out.println(
                "Object was an instance of the class java.util.Vector");
        else if (o instanceof ArrayList) System.out.println(
                "Object was an instance of the class java.util.ArrayList");
        else System.out.println("Object was an instance of the " + o.getClass());
    }

    public static void main(String[] args) {
        L01_SortAndSearch1.printArray("Fibonaci of 10", fibonacci(15).toArray());
        System.out.println("10! = " + factorial(new BigInteger("10")).toString());
        dysplayObjectClass(new L03_MultipleFunctionExample());
    }




}

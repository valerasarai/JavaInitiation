package com.valerastudy.Exceptions;

import java.awt.*;

public class L01_UseOfFinaly {

    public static void main(String[] args) {
//       doTheWork();
        example2(1,1);
        example2(null);
    }

    public static void doTheWork() {
        Object o = null;
        for (int i = 0; i < 5; i++) {
            try {
                o = makeObj(i);
                System.out.println("in try " + i + " - " + o);
            } catch (IllegalArgumentException e) {
                System.err.println("Error: (" + e.getMessage() + ").");
                return;
            } finally {
                System.err.println("in try " + i + " All done");
                if (o == null) {
                    System.out.println("if finally " + i + " - " + o);
                    System.exit(0);
                }
            }
            System.out.println("out try " + i + " - " + o);
        }
    }

    public static Object makeObj(int type) throws IllegalArgumentException {
        if (type == 4) throw new IllegalArgumentException("Don't like type " + type);
        return new Object();
    }

    public static void example2(int... data) {
        try {
            data[0] = data[0]/data[1];
            System.out.println(data);
        } catch(NullPointerException e) {
            System.out.println(e);
            return;
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}

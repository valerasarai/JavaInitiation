package com.valerastudy.Methods;

public class L07_Varrargs {

    // String
    static void display(String... values) {
        System.out.println("display method invoked ");
        for (String s : values) {
            System.out.println(s);
        }
    }

    // int
    static int sumvarargs(int... intArr) {
        int sum, i;
        sum = 0;
        for (i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }
        return sum;
    }

    // overriting varargs method
    // int
    static void vaTest(int... no) {
        System.out.println(
                "vaTest(int...): " + "Number of args: " + no.length + " Contents: ");
        for (int n : no) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    // boolean
    static void vaTest(boolean... bl) {
        System.out.println(
                "vaTest(boolean...): " + "Number of args: " + bl.length + " Contents: ");
        for (boolean n : bl) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    // String
    static void vaTest(String sep, String... str) {
        System.out.println(
                "vaTest(String, String...): " + "Number of args: " + str.length + " Contents: ");
        for (String n : str) {
            System.out.print(n + sep);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        display();
        display("This is a Book!");
        display("This", "is", "a", "Book!");
        System.out.println();
        System.out.println("Sum of 1,2,3,4 = " + sumvarargs(1, 2, 3, 4));
        System.out.println("Sum of 10 = " + sumvarargs(10));
        System.out.println("Sum of  = " + sumvarargs());
        System.out.println("Sum of {1,2,3,4} = " + sumvarargs(new int[]{1, 2, 3, 4}));
        System.out.println();
        vaTest(1,2,3,4);
        vaTest(Boolean.TRUE,Boolean.FALSE,Boolean.TRUE,Boolean.TRUE);
        vaTest(", ", "This", "is", "a", "Book!");
        vaTest(true,false,true,false);
    }
}
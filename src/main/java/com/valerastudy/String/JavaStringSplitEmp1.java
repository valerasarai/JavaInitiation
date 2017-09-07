package com.valerastudy.String;

public class JavaStringSplitEmp1 {
    public static void main(String[] args) {
        String string1 = "This is a Book!";
        String[] temp;
        String delimiter = " ";

        temp = string1.split(delimiter);

        for (int i = 0; i < temp.length; i++) {
            System.out.println("for 1 i=" + i + ": "+ temp[i]);
            System.out.println("");

            string1 = "This.is.a.Book!";
            delimiter = "\\.";
            temp = string1.split(delimiter);
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.println("for 2 i=" + i + ": "+ temp[i]);
            System.out.println("");

            for (int j = 0; j < temp.length; j++) {
                System.out.println("for 3 j=" + j + ": "+ temp[j]);
            }
        }

    }
}

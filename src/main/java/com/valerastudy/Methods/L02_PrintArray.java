package com.valerastudy.Methods;

public class L02_PrintArray {

    //Integer[]
    public static void printArray(Integer[] inArr) {
        System.out.printf("[%s]-{", inArr.length);
        int i = 0;
        for (Integer elem : inArr) {
            if (i == 0) System.out.printf("%s", elem);
            else System.out.printf(", %s", elem);
            i++;
        }
        System.out.println("}");
    }

    //Double[]
    public static void printArray(Double[] inArr) {
        System.out.printf("[%s]-{", inArr.length);
        int i = 0;
        for (double elem : inArr) {
            if (i == 0) System.out.printf("%s", elem);
            else System.out.printf(", %s", elem);
            i++;
        }
        System.out.println("}");
    }

    //Character[]
    public static void printArray(Character[] inArr) {
        System.out.printf("[%s]-{", inArr.length);
        int i = 0;
        for (Character elem : inArr) {
            if (i == 0) System.out.printf("'%s'", elem);
            else System.out.printf(", '%s'", elem);
            i++;
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        printArray(integerArray);

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);

        System.out.println("\nArray characterArray contains:");
        printArray(characterArray);
    }


}

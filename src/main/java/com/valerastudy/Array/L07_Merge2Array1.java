package com.valerastudy.Array;

public class L07_Merge2Array1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {4,16,1,2,3,22};
        int[] c = new int[a.length+b.length];
        int count = 0;

        //bagare primul tabel
        for (int i = 0; i < a.length; i++) {
            c[count++] = a[i];
        }

        //bagare al II-lea tabel
        for (int i = 0; i < b.length; i++) {
            c[count++] = b[i];
        }

        L01_SortAndSearch1.printArray("Array a is", a);
        L01_SortAndSearch1.printArray("Array b is", b);
        L01_SortAndSearch1.printArray("Array c is", c);



    }
}

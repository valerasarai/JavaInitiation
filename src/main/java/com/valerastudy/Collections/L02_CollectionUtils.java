package com.valerastudy.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

public class L02_CollectionUtils {
    public static void main(String[] args) {

//Ex 1 Print Collection
///////////////////////////////////////////////////////////////////////////////////////////
//        treeExample();
//Ex 2 Collection Removal via iterator
///////////////////////////////////////////////////////////////////////////////////////////
        removeElement();
    }

    //Ex 1 Print Collection
///////////////////////////////////////////////////////////////////////////////////////////
    public static void treeExample() {

        System.out.println("Tree Map Example!\n");

        TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
        tMap.put(1, "Sunday");
        tMap.put(2, "Monday");
        tMap.put(3, "Tuesday");
        tMap.put(4, "Wednesday");
        tMap.put(5, "Thursday");
        tMap.put(6, "Friday");
        tMap.put(7, "Saturday");

        System.out.println("Keys of tree map: " + tMap.keySet());
        System.out.println("Values of tree map: " + tMap.values());
        System.out.println("Key: 5 value: " + tMap.get(5) + "\n");

        System.out.println(
                "First key: " + tMap.firstKey() + " Value: " + tMap.get(tMap.firstKey()) + "\n");

        System.out.println(
                "Last key: " + tMap.lastKey() + " Value: " + tMap.get(tMap.lastKey()) + "\n");

        System.out.println("Removing first data: " + tMap.remove(tMap.firstKey()));

        System.out.println("Now the tree map Keys: " + tMap.keySet());
        System.out.println("Now the tree map contain: " + tMap.values() + "\n");

        System.out.println("Removing last data: " + tMap.remove(tMap.lastKey()));
        System.out.println("Now the tree map Keys: " + tMap.keySet());
        System.out.println("Now the tree map contain: " + tMap.values());
    }


    //Ex 2 Collection Removal via iterator
///////////////////////////////////////////////////////////////////////////////////////////
    public static void removeElement() {
        System.out.println("Collection Example!\n");

        int size;
        HashSet<String> collection = new HashSet<String>();
        String str1 = "Yellow", str2 = "White", str3 = "Green", str4 = "Blue";

        Iterator iterator;
        collection.add(str1);
        collection.add(str2);
        collection.add(str3);
        collection.add(str4);

        size = collection.size();
        System.out.println("Collection size: " + size);
        System.out.print("Collection data: ");
        iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();

        collection.remove(str2);
        System.out.println("\nAfter removing [" + str2 + "]");
        System.out.print("Now collection data: ");
        iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();

        size = collection.size();
        System.out.println("Collection size: " + size);
    }

}


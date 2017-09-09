package com.valerastudy.Directories;
import com.valerastudy.Files.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class L01_CreateDelete {

    public static void main(String[] args) throws IOException {
        //step 1
        directoriesCreate("C:\\Files\\dir1");
        directoryDelete("C:\\Files\\dir1");

        //step 2
        directoriesCreate("C:\\Files\\dir1\\A\\A\\B");
        directoryDelete("C:\\Files\\dir1");

        //step 3
        directoriesCreate("C:\\Files\\dir1\\A\\A\\B");
        L01_FilePathCreateAndWrite.createFile(new File("C:\\Files\\dir1\\A\\A\\B\\test.txt"));
//        new Scanner(System.in).nextLine();
        if (directoriesDelete("C:\\Files\\dir1")) System.out.println("C:/Files/dir1 - deleted!");
        else System.out.println("C:/Files/dir1 - not deleted!");

    }

    //Creation of dir
    public static void directoriesCreate(String dirPath) {
        if (new File(dirPath).mkdirs()) System.out.println("Succesful created " + dirPath + " directories!");
        else System.out.println("Error in creation " + dirPath + " directories or directory exist!");
    }

    //Delete one empty dir
    public static void directoryDelete(String dirPath) {
        if (new File(dirPath).delete()) System.out.println("Succesful deleted " + dirPath + " directories!");
        else System.out.println("Error on delete " + dirPath + " directories or directory not found!");
    }

    //Delete dirs recursively
    public static boolean directoriesDelete(String dirsPath) {
        File file = new File(dirsPath);
        if (file.isDirectory()) {
            for (String children : file.list()) {
                System.out.println("\t" + dirsPath + "\\" + children + " - " + directoriesDelete(dirsPath + "\\" + children));
            }
        }
        if (file.delete()) return true;
        else return false;
    }
}


package com.valerastudy.Directories;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class L02_DirectoryUtils {
    public static void main(String[] args) {
        // is empty check
//        System.out.println(dirIsEmpty("C:\\Files"));
//        System.out.println(dirIsEmpty("C:\\Files\\test.txt"));
//        System.out.println(dirIsEmpty("C:\\Files\\dir1"));

        // is Hidden check
//        System.out.println(dirIsHidden("C:\\Files"));
//        System.out.println(dirIsHidden("C:\\Files\\test.txt"));
//        System.out.println(dirIsHidden("C:\\Files\\dir1"));

        // show directory Three
//        directoryThree("C:\\Files", "-");

        //check directory size using org.apache.commons.io.FileUtils
//        float size = FileUtils.sizeOfDirectory(new File("C:/Windows"))%FileUtils.ONE_GB;
//        System.out.println("Size: " + size + " GB");

        //Get current directory from System.Property and reset it
//        System.out.println(currentDirectory());
//        System.setProperty("user.dir", "C:\\Files");
//        System.out.println(currentDirectory());

        //Search file in the directory
        searchFileStartWith("2");
    }


    //if is empty
    public static String dirIsEmpty(String dirPath) {
        if (new File(dirPath).isDirectory()) {
            if ((new File(dirPath).list().length) > 0) return "Directory " + dirPath + " - is not empty!";
            else return "Directory " + dirPath + " - is empty!";
        } else return dirPath + " - is not an directory!";
    }

    //Attribute check = Hidden
    public static String dirIsHidden(String dirPath) {
        if (new File(dirPath).isDirectory()) {
            if (new File(dirPath).isHidden()) return "Directory " + dirPath + " - is Hidden!";
            else return "Directory " + dirPath + " - is not Hidden!";
        } else return dirPath + " - is not an directory!";
    }

    //Print directory three
    public static void directoryThree(String dirPath, String prefix) {
        File file = new File(dirPath);
        System.out.println(prefix + file.getName());
        if ((file.isDirectory()) && (file.list().length > 0)) {
            for (String subdir : file.list()) {
                directoryThree(dirPath + "\\" + subdir, prefix + "-");
            }
        }
    }

    //current dir check
    public static String currentDirectory() {
        return System.getProperty("user.dir");
    }

    //Display root directories in the system - Not WORK
//    public static void getRootDirectoriesInSystem(){
//        List<String> strings = new ArrayList<String>();
//        File roots = new File.listRoots();
//
//    }

    //Search file in directory
    public static void searchFileStartWith(final String criteria) {
        File dir = new File("C:\\Files");
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.contains(criteria);
            }
        };

        String[] children = dir.list(filter);
        if (children == null) {
            System.out.println("Either dir does not exist or is not a directory");
        } else {
            for (int i = 0; i < children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }

}

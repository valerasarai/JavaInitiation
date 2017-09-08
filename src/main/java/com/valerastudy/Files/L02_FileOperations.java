package com.valerastudy.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class L02_FileOperations {
    //main statement
    public static void main(String[] args) {
        System.out.println("D://Files/Book1.txt - " + fileLastModifiedDate("D://Files/Book1.txt"));
        System.out.println("D://Files/Book4.txt - " + fileLastModifiedDate(new File("D://Files/Book4.txt")));
        System.out.println("D://Files/Book1.txt - " + fileExist("D://Files/Book1.txt"));
        System.out.println("D://Files/Book10.txt - " + fileExist(new File("D://Files/Book10.txt")));
        fileReadOnly("D://Files/Book1.txt");
        System.out.println("D://Files/Book1.txt canWrite() - " + new File("D://Files/Book1.txt").canWrite());
        new File("D://Files/Book1.txt").setWritable(true);
        System.out.println("D://Files/Book1.txt canWrite() - " + new File("D://Files/Book1.txt").canWrite());
        System.out.print("D://Files/Book1.txt to Book10 - "); fileRename("D://Files/Book1.txt", "D://Files/Book10.txt");
        System.out.println("D://Files/Book10.txt - " + fileExist("D://Files/Book10.txt"));
        System.out.println("D://Files/Book1.txt - " + fileExist("D://Files/Book1.txt"));

        System.out.println("Size of D://Files/Book1.txt - " + fileSizeInByte("D://Files/Book1.txt"));
        System.out.println("Size of D://Files/Book2.txt - " + fileSizeInByte("D://Files/Book2.txt"));
        System.out.println("Size of D://Files/Book5.txt - " + fileSizeInByte("D://Files/Book5.txt"));
        System.out.println("D://Files/Book1.txt - " + fileLastModifiedDate("D://Files/Book1.txt"));
        fileChangeModifyDate("D://Files/Book1.txt", 10, 10, 01, 01, 1999);
        System.out.println("D://Files/Book1.txt - " + fileLastModifiedDate("D://Files/Book1.txt"));
        fileCopy("D://Files/Book4.txt", "D://Files/Book1.txt");

    }


    //file.lastModified(); - by Path
    public static String fileLastModifiedDate(String pathname) {
        if (fileExist(pathname) == "Exist!")
            return new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format((new File(pathname).lastModified()));
        else return "File not found!";
    }

    //file.lastModified(); - by file
    public static String fileLastModifiedDate(File f) {
        if (fileExist(f) == "Exist!")
            return new Date(f.lastModified()).toString();
        else return "File not found!";
    }

    //file.exist(); by Path
    public static String fileExist(String pathname) {
        if (new File(pathname).exists()) return "Exist!";
        else return "Not found!";
    }

    //file.exist(); by File
    public static String fileExist(File file) {
        if (file.exists()) return "Exist!";
        else return "Not found!";
    }

    //file.sets_parameters ReadOnly
    public static boolean fileReadOnly(String path) {
        return new File(path).setReadOnly();
    }

    //file.rename
    public static void fileRename(String pathfile1, String pathfile2) {
        if (new File(pathfile1).renameTo(new File(pathfile2))) {
            System.out.println("Renamed successful!");
        } else {
            System.out.println("Error on rename!");
        }
    }

    //file.SizeInByte - for path
    public static String fileSizeInByte(String pathname) {
        if (fileExist(pathname) == "Exist!")
            return String.valueOf(new File(pathname).length()) + " Bytes";
        else return "File not found!";
    }

    //file.SizeInByte - for file
    public static String fileSizeInByte(File f) {
        if (fileExist(f) == "Exist!")
            return String.valueOf(f.length()) + " Bytes";
        else return "File not found!";
    }

    public static void fileChangeModifyDate(String pathname, int h, int m, int D, int M, int Y) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, Y);
        cal.set(Calendar.MONTH, M);
        cal.set(Calendar.DAY_OF_MONTH, D);
        cal.set(Calendar.HOUR_OF_DAY, h);
        cal.set(Calendar.MINUTE, m);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        Date d = cal.getTime();

        if (fileExist(pathname) == "Exist!") {
            new File(pathname).setLastModified(d.getTime());
            System.out.println("Date modified successful!");
        } else System.out.println("File on the specified path is not found!");
    }

    public static void fileCopy(String inPath, String desPath) {
        FileInputStream ins = null;
        FileOutputStream outs = null;

        try {
            File infile = new File(inPath);
            File outfile = new File(desPath);
            ins = new FileInputStream(infile);
            outs = new FileOutputStream(outfile);

            byte[] buffer = new byte[1024];
            int length;

            while ((length = ins.read(buffer)) > 0) {
                outs.write(buffer, 0, length);
            }

            ins.close();
            outs.close();

            System.out.println("File copied successfully!!");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}


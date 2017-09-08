package com.valerastudy.Files;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class L01_FilePathCreateAndWrite {
    public static void main(String[] args) throws IOException {
//        File f1 = new File("D:/Files/demo1.txt");
//        File f2 = new File("D:/Files/demo1.txt");
//        File f3 = new File("C:/Doc/demo1.txt");

//        compareFile(f1, f2);
//        compareFile(f1, f3);
//        compareFile(f2, f3);

//        createFile(f1);
//
//        createFileUsingFileClass("D:/Files/Book1.txt");
//        createFileUsingFileOutputStreamClass("D:/Files/Book2.txt");
//        createFileIn_NIO("D:/Files/Book3.txt","D:/Files/Book4.txt");
//        createFileBuild("D:/Files/Book5.txt");

//        createTemporarFile("BookT!", ".txt","D:/Files/");
        createTempFile();


    }

    public static void compareFile(File f1, File f2) {
        if (f1.compareTo(f2) == 0)
            System.out.println("Both paths are same!");
        else
            System.out.println("Paths are not same!");
    }

    public static void createFile(File f1) throws IOException {
        try {
            if (f1.createNewFile()) {
                System.out.println("Success!");
            } else System.out.println("Error, file alredy exist.");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void createFileUsingFileClass(String path) throws IOException {
        File file = new File(path);
        //create file
        createFile(file);
        //Write content
        FileWriter writer = new FileWriter(file);
        writer.write("This is a book!");
        writer.close();
    }

    public static void createFileUsingFileOutputStreamClass(String path) throws IOException {
        String data = "This is a Book 1!";
        FileOutputStream out = new FileOutputStream(path);
        out.write(data.getBytes());
        out.close();
    }

    public static void createFileIn_NIO(String... paths) throws IOException {
        String data = "This is a Book 2!";
        Files.write(Paths.get(paths[0]), data.getBytes());

        List<String> lines = Arrays.asList("1st line", "2nd line");
        Files.write(Paths.get(paths[1]),
                lines,
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }

    public static void createFileBuild(String path) throws IOException {
        Path p1 = Paths.get(path);
        Files.createDirectories(p1.getParent());
        try {
            Files.createFile(p1);
        } catch (FileAlreadyExistsException e) {
            System.err.println("already exists: " + e.getMessage());
        }
        Files.write(p1, "This is Build function!".getBytes());
    }

    public static void createTemporarFile(String filename, String fileextension, String dirpath) throws IOException {
        File temp = File.createTempFile(filename, fileextension, new File(dirpath));
        temp.deleteOnExit();
        BufferedWriter out = new BufferedWriter(new FileWriter(temp));
        out.write(new Scanner(System.in).nextLine());
        System.out.println("temporary file created:");
        out.close();
        new Scanner(System.in).nextLine();
    }

    public static void createTempFile() {
        try {
            File f1 = File.createTempFile("temp-file-name", ".tmp");
            System.out.println("Temp file : " + f1.getAbsolutePath());
            f1.deleteOnExit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

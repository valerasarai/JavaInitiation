package com.valerastudy.Exceptions;

import java.util.EmptyStackException;
import java.util.Stack;

public class L02_HandleException {
    public static void main(String[] args) {
        //ex.1
//        tryMammel();
        //ex.2
//        handleMethods();
        //ex.3
//        emptyStack();
        //ex.4
//        handleMethodsOverload();
        //ex.5
//        hanfleMethodsOverloadAfterInheritance();
        //ex.6
//        checkedException();
        //ex.7
//        catchToHandle1();
//        catchToHandle2();
        //ex.8
//        try { catchToHandle3();} catch (Exception e) {e.printStackTrace();}
//        catchToHandle3("123");
        //ex.9
//        multipleCatch1();
        //ex.10
//        multipleCatch2();
        //ex.11
//        newExceprion();
        //ex.12
//        threadException();
        //ex.13
        newDefinedException();
    }

    // Example 1 hierarchies
    /////////////////////////////////////////////////////////////////////////
    public static void tryMammel() {
        try {
            throw new L02_Exception_Mammel();
        } catch (L02_Exception_Mammel m) {
            System.err.println("It is mammel");
        }
    }

    // Example 2 methods
    /////////////////////////////////////////////////////////////////////////
    public static void handleMethods() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.err.println("Caught Exception");
            System.err.println("getMessage():" + e.getMessage());
            System.err.println("getLocalizedMessage():" + e.getLocalizedMessage());
            System.err.println("toString():" + e);
            System.err.println("printStackTrace():");
            e.printStackTrace();
        }
    }

    // Example 3 - empty Stack
    /////////////////////////////////////////////////////////////////////////
    public static void emptyStack() {
        int count = 1000000;
        Stack s = new Stack();
        Stack st1 = null;

        System.out.println("Testing for empty stack");

        long s1 = System.currentTimeMillis();

        for (int i = 0; i <= count; i++)
            if (!s.empty()) s.pop();

        long s2 = System.currentTimeMillis();

        System.out.println((s2 - s1) + " milliseconds");

        System.out.println("Catching EmptyStackException");
        s1 = System.currentTimeMillis();

        for (int i = 0; i <= count; i++) {
            try {
//                s.pop();
//                throw new EmptyStackException();
                st1.empty();
            } catch (EmptyStackException e) {
            }
        }
        s2 = System.currentTimeMillis();
        System.out.println((s2 - s1) + " milliseconds");
    }

    // Example 4 - in overload methods
    /////////////////////////////////////////////////////////////////////////

    public static double methodToOverload(int i) throws Exception {
        return i / 0;
    }

    public static boolean methodToOverload(boolean b) {
        return !b;
    }

    public static double methodToOverload(int x, double y) {
        return x + y;
    }

    public static double methodToOverload(double x, double y) {
        return x + y - 3;
    }

    public static void handleMethodsOverload() {
        try {
            System.out.println(methodToOverload(10, 20.0));
            System.out.println(methodToOverload(10.0, 20));
            System.out.println(methodToOverload(10.0, 20.0));
            System.out.println(methodToOverload(10));
        } catch (Exception ex) {
            System.out.println("exception occoure: " + ex);
        }
    }

    // Example 5 - in overload methods after inheritance
    /////////////////////////////////////////////////////////////////////////
    public static void hanfleMethodsOverloadAfterInheritance() {
        L02_Exception_NewClass1 n = new L02_Exception_NewClass();
        try {
            n.msg();
        } catch (Exception e) {
        }
    }


    // Example 6 - checked exception
    /////////////////////////////////////////////////////////////////////////
    public static void checkedException() {
        try {
            throw new Exception("throwing an exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Example 7 - catch to handle exception
    /////////////////////////////////////////////////////////////////////////
    public static void catchToHandle1() {
        int array[] = {20, 20, 40};
        int num1 = 15, num2 = 10;
        int result = 10;

        try {
            result = num1 / num2;
            System.out.println("The result is: " + result);

            for (int i = 3; i >= 0; i--) {
                System.out.println("The value of array is " + array[i]);
            }
        } catch (Exception e) {
            System.out.println("Exception occoured : " + e);
        }
    }

    // Example 7 - catch to handle exception
    /////////////////////////////////////////////////////////////////////////
    public static void catchToHandle2() {
        int data = 100;
        try {
            data = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
            data = 0;
        }
        System.out.println("rest of the code...");
        System.out.println(data);
    }

    // Example 8 - catch to handle exception
    /////////////////////////////////////////////////////////////////////////
    public static void catchToHandle3() throws Exception {
        int n = 20, result = 0;

        try {
            result = n / 0;
            System.out.println("The result is " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic exception occoured: " + ex);
            try {
                throw new NumberFormatException();
            } catch (NumberFormatException ex1) {
                System.out.println("Chained exception thrown manually: " + ex1);
            }
        }
    }

    public static void catchToHandle3(String args) {
        int n = 20, result = 0;

        try {
            result = n / 0;
            System.out.println("The result is " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic exception occoured: " + ex);
            try {
                throw new NumberFormatException();
            } catch (NumberFormatException ex1) {
                System.out.println("Chained exception thrown manually: " + ex1);
            }
        }
    }

    // Example 9 - multiple catch
    /////////////////////////////////////////////////////////////////////////
    public static void multipleCatch1() {
        int array[] = {20, 20, 40};
        int num1 = 15, num2 = 0;
        int result = 0;

        try {
            result = num1 / num2;
            System.out.println("The result is: " + result);

            for (int i = 2; i >= 0; i--) {
                System.out.println("The value of array is: " + array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error. Array is out of Bounds: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Can't be divided by Zero: " + e);
        }
    }

    // Example 10 - multiple catch
    /////////////////////////////////////////////////////////////////////////
    public static void multipleCatch2() {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("task 1 is completed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("task 2 completed");
        } catch (Exception e) {
            System.out.println("common task completed");
        }
        System.out.println("rest of the code...");
    }

    // Example 11 - multiple catch
    /////////////////////////////////////////////////////////////////////////
    public static void ExceptionFunc() throws Throwable {
        Throwable t = new Throwable("This is new Exception in Java...");

        StackTraceElement[] trace = new StackTraceElement[]{
                new StackTraceElement("ClassName", "methodName", "fileName", 5)};
        t.setStackTrace(trace);
        throw t;
    }

    public static void newExceprion() {
        try {
            ExceptionFunc();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    // Example 12 - thread exceprion
    /////////////////////////////////////////////////////////////////////////
    public static void threadException() {
        L02_Exception_MyThread t = new L02_Exception_MyThread();
        t.start();
        try {
            Thread.sleep(1000);
        } catch (Exception x) {
            System.out.println("Caught it " + x);
        }
        System.out.println("Exiting main");
    }

    // Example 13 - user defined exception
    /////////////////////////////////////////////////////////////////////////
    public static void newDefinedException() {
        try {
            throw new L02_Exception_MyException("Custom message");
        } catch(L02_Exception_MyException exp) {
            System.out.println(exp);
        }

    }
}


// Additional tests classes
/////////////////////////////////////////////////////////////////////////
class L02_Exception_Animal extends Exception {
}

class L02_Exception_Mammel extends L02_Exception_Animal {
}

class L02_Exception_NewClass1 {
    void msg() throws Exception {
        System.out.println("this is parent");
    }
}

class L02_Exception_NewClass extends L02_Exception_NewClass1 {
    L02_Exception_NewClass() {
    }

    void msg() throws ArithmeticException {
        System.out.println("This is child");
    }
}

class L02_Exception_MyThread extends Thread {
    public void run() {
        System.out.println("Throwing in " + "MyThread");
        throw new RuntimeException();
    }
}

class L02_Exception_MyException extends Exception {
    String s1;

    L02_Exception_MyException(String s2) {
        s1 = s2;
    }

    @Override
    public String toString() {
        return ("Output String = " + s1);
    }
}
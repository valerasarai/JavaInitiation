package com.valerastudy.DataStructure;

import java.io.IOException;

public class L02_Stack {
    public static void main(String[] args) {

//Ex 1 Summation of Numbers
///////////////////////////////////////////////////////////////////////////////////////////
//        try {
//            System.out.println("Sum=" + stackAddition(10002));
//        } catch (IOException e) {
//            System.out.println("exceprion exist:" + e);
//        }
//Ex 2 Summation of Numbers
///////////////////////////////////////////////////////////////////////////////////////////
//        stackAddition1(10);
//Ex 3 Infix to Postfix
///////////////////////////////////////////////////////////////////////////////////////////


    }

    //Ex 1 Summation of Numbers
///////////////////////////////////////////////////////////////////////////////////////////
    public static int stackAddition(int num) throws IOException {
        int ans = 0;
        L02_DS_Stack theStack;

        theStack = new L02_DS_Stack(10001);

        while (num > 0) {
            theStack.push(num);
            --num;
        }

        while (!theStack.isEmpty()) {
            int newN = theStack.pop();
            ans += newN;
        }
        return ans;
    }

    //Ex 2 Summation of Numbers
///////////////////////////////////////////////////////////////////////////////////////////
    public static void stackAddition1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The Sum Of " + n + " is " + sum);
    }

    //Ex 3 Infix to Postfix
///////////////////////////////////////////////////////////////////////////////////////////


}

//Additional Classes
///////////////////////////////////////////////////////////////////////////////////////////
class L02_DS_Stack {
    private int maxSize;
    private int[] data;
    private char[] dataCh;
    private int top;

    public L02_DS_Stack(int s) {
        maxSize = s;
        data = new int[maxSize];
        dataCh = new char[maxSize];
        top = -1;
    }

    public void push(int p) {
        data[++top] = p;
    }

    public void push(char p) {
        dataCh[++top] = p;
    }

    public int pop() {
        return data[top--];
    }

    public char popCh() {
        return dataCh[top--];
    }

    public int peek() {
        return data[top];
    }

    public char peekCh() {
        return dataCh[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

class L02_DS_InToPost {
    private L02_DS_Stack theStack;
    private String input;
    private String output = "";

    public L02_DS_InToPost(String in) {
        input = in;
        int stackSize = input.length();
        theStack = new L02_DS_Stack(stackSize);
    }

    public String doTrans() {
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '+':
                case '-':
                    gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;
                case '(':
                    theStack.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }
        while (!theStack.isEmpty()) {
            output = output + theStack.popCh();
        }
        System.out.println(output);
        return output;
    }

    public void gotOper(char opThis, int prec1) {
        while (!theStack.isEmpty()) {
            char opTop = theStack.popCh();
            if (opTop == '(') {
                theStack.push(opTop);
                break;
            } else {
                int prec2;
                if (opTop == '+' || opTop == '-')
                    prec2 = 1;
                else
                    prec2 = 2;
                if (prec2 < prec1) {
                    theStack.push(opTop);
                    break;
                } else output = output + opTop;
            }
        }
        theStack.push(opThis);
    }

    public void gotParen(char ch) {
        while (!theStack.isEmpty()) {
            char chx = theStack.popCh();
            if (chx == '(')
                break;
            else output = output + chx;
        }
    }

    public static void main(String[] args) throws IOException {
        String input = "1+2*4/5-7+3/6";
        String output;
        L02_DS_InToPost theTrans = new L02_DS_InToPost(input);
        output = theTrans.doTrans();
        System.out.println("Postfix is " + output + '\n');
    }
}

class L02_DS_StringReverserThroughStack {
    private String input;
    private String output;
    public L02_DS_StringReverserThroughStack(String in) {
        input = in;
    }
    public String doRev() {
        int stackSize = input.length();
        Stack theStack = new Stack(stackSize);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            theStack.push(ch);
        }
        output = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            output = output + ch;
        }
        return output;
    }
    public static void main(String[] args) throws IOException {
        String input = "Java Source and Support";
        String output;
        L02_DS_StringReverserThroughStack theReverser =
                new L02_DS_StringReverserThroughStack(input);
        output = theReverser.doRev();
        System.out.println("Reversed: " + output);
    }
    class Stack {
        private int maxSize;
        private char[] stackArray;
        private int top;

        public Stack(int max) {
            maxSize = max;
            stackArray = new char[maxSize];
            top = -1;
        }
        public void push(char j) {
            stackArray[++top] = j;
        }
        public char pop() {
            return stackArray[top--];
        }
        public char peek() {
            return stackArray[top];
        }
        public boolean isEmpty() {
            return (top == -1);
        }
    }
}
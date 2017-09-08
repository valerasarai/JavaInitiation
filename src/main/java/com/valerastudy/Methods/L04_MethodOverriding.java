package com.valerastudy.Methods;

import com.sun.org.apache.regexp.internal.RE;

public class L04_MethodOverriding {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(5, 5);
        Figure figref;
        figref = f;
        System.out.println("Area is: " + figref.area());
        figref = r;
        System.out.println("Area is: " + figref.area());
    }
}

class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    Double area() {
        System.out.println("Inside area for figure.");
        return (dim1 * dim2);
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    Double area() {
        System.out.println("Inside area of rectangle.");
        return (dim1 * dim2);
    }
}

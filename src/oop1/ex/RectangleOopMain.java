package oop1.ex;

import java.awt.*;

public class RectangleOopMain {
    public static void main(String[] args) {


        Rectangle1 rectangle = new Rectangle1();
        rectangle.width = 5;
        rectangle.height = 5;

        // 넓이
        int area = rectangle.calculateArea();
        System.out.println("넓이 = " + area);

        // 둘레
        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 = " + perimeter);

        // 정사각형 여부
        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부 = " + square);
    }

}

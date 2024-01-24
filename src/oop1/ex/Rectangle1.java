package oop1.ex;

public class Rectangle1 {
    int width = 0;
    int height = 0;
    boolean isSquare = false;

     int calculateArea() {
        return width * height;
    }

     int calculatePerimeter() {
        return 2 * (width + height);
    }

     boolean isSquare() {;
        return width == height;
    }

}

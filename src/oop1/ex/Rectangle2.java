package oop1.ex;

public class Rectangle2 {
    int width = 0;
    int height = 0;
    boolean isSquare = false;

     int calculateArea() {
        int area = 0;
        area = width * height;
        System.out.println("넓이 = " + area);
        return area;
    }

     int calculatePerimeter() {
        int perimeter = 0;
        perimeter = 2 * (width + height);
        System.out.println("둘레 길이 = " + perimeter);
        return perimeter;
    }

     boolean isSquare() {;
        if(width == height){
            isSquare = true;
            System.out.println("정사각형이 맞습니다.");
        }else {
            System.out.println("정사각형이 아닙니다.");
        }
        return isSquare;
    }

}

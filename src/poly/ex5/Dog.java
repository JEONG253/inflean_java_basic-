package poly.ex5;

import poly.ex4.AbstractAnimal;

public class Dog implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 움직입니다.");
    }
}

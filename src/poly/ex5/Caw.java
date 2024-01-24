package poly.ex5;

import poly.ex4.AbstractAnimal;

public class Caw implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("음매");
    }


    @Override
    public void move() {
        System.out.println("소가 움직입니다.");
    }

}

package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {

        // 추상 클래스는 생성이 불가능
//        AbstractAnimal abstractAnimal = new AbstractAnimal();

        Cat cat = new Cat();
        Caw caw = new Caw();
        Dog dog = new Dog();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        moveAnimal(cat);
        moveAnimal(caw);
        moveAnimal(dog);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}

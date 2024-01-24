package poly.ex3;


public class AbstractMain {
    public static void main(String[] args) {

        // 추상 클래스는 생성이 불가능
//        AbstractAnimal abstractAnimal = new AbstractAnimal();

        Cat cat = new Cat();
        Caw caw = new Caw();
        Dog dog = new Dog();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);

    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}

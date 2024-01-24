package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {

        // 인터페이스는 완전 추상이기 떄문에 인스턴스 생성 불가
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(dog);

    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}

package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Caw caw = new Caw();
        Cat cat = new Cat();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 울음소리 시작");
        animal.sound();
        System.out.println("동물 울음소리 종료");
    }
}

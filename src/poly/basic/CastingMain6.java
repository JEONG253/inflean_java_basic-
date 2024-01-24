package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {

        Parent parent = new Parent();
        System.out.println("parent 호출");
        call(parent);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);

    }

    private static void call(Parent parent) {
        parent.parentMethod();

        if (parent instanceof Child child)  {
            System.out.println("Child 인스턴스가 맞다. ");
            child.childMethod();
        }
    }
}

package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("child -> child ");
        System.out.println("child.value = " + child.value);
        child.method();

        // 변수가 부모 인스턴스를 참조하는 경우
        Parent parent = new Parent();
        System.out.println("parent -> parent ");
        System.out.println("parent.value = " + parent.value);
        parent.method();

        // 부모 변수가 자식 인스턴스를 참조하는 경우(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent => child");
        System.out.println("ploy.value = " + poly.value); // 변수는 오버라이딩 x
        poly.method(); // 메서드는 오버라이딩
    }
}

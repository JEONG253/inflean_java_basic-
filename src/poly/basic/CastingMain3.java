package poly.basic;

// up casting vs down casting
public class CastingMain3 {

    public static void main(String[] args) {

        Child child = new Child();
        Parent parent = (Parent) child; // 업 캐스팅은 생략이 가능하다.

        Parent parent2 = child; // 업 캐스팅 생략

        parent.parentMethod();
        parent2.parentMethod();
    }


}

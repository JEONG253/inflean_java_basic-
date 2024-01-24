package poly.basic;

// 다운캐스팅을 자동으로 하지 않을 경우
public class CastingMain4 {
    public static void main(String[] args) {

        Parent parent = new Child();
        Child child = (Child) parent;
        child.childMethod();

        Parent parent2 = new Parent();


        Child child2 = (Child) parent2; // 런타임 오류 - classCastException
        child2.childMethod(); // 실행 불가

    }
}

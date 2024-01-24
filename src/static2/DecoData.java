package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();

    }
    public void instanceCall() {
        instanceValue++;
        instanceMethod();
        staticValue++; // 정적 변수 접근 : 클래스 내에 존재하므로 DecoData.이 생략되었음
        staticMethod(); // 정적 메서드 접근
    }
    public static void staticCall() {
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
//        instanceValue++; // 인스턴스 변수 접근
//        instanceMethod(); // 인스턴스 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}

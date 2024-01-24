package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // 이미 참조 대상을 만들었기 때문에 새로 참조값을 만드는 것이 안된다.
        // data = new Data();

        // 참조 대상의 값은 변경 가능하다.
        data.value = 10;
        System.out.println("data.value = " + data.value);
        data.value = 20;
        System.out.println("data.value = " + data.value);

    }
}

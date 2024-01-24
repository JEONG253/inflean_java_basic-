package ref;

public class VarChange2 {
    public static void main(String[] args) {

        Data data = new Data();
        data.value = 10;
        Data data2 = data;

        System.out.println("data 참조값 = " + data);
        System.out.println("data2 참조값 = " + data2);
        System.out.println("data.value = " + data.value);
        System.out.println("data2.value = " + data2.value);

        // a 변경
        data.value = 20;
        System.out.println("data.value = 20으로 변경 후 ");
        System.out.println("data.value = " + data.value);
        System.out.println("data2.value = " + data2.value);

        // b 변경
        data2.value = 30;
        System.out.println("data2.value = 30으로 변경 후 ");
        System.out.println("data.value = " + data.value);
        System.out.println("data2.value = " + data2.value);


    }
}

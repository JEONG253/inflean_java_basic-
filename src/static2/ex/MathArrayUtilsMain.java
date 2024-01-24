package static2.ex;

import static static2.ex.MathArrayUtils.*;

public class MathArrayUtilsMain {
    public static void main(String[] args) {

        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum(values) = " + sum(values));
        System.out.println("average(values) = " + average(values));
        System.out.println("min(values) = " + min(values));
        System.out.println("max(values) = " + max(values));
    }
}

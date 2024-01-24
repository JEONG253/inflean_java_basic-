package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        // private 인스턴스 생성을 막는다.
    }

    public static int sum(int[] array) { // 배열 모두 더한 값
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] array) { // 배열 평균값
        int sum = sum(array);
        return (double) sum / array.length;
    }
    public static int min(int[] array) { // 배열에서 최솟값
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
    public static int max(int[] array) { // 배열에서 최댓값
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

}


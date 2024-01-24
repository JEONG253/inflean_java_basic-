package access;

public class PointMain {
    public static void main(String[] args) {
        Point point = new Point(5000);

        point.pointUp();
        point.showPoint();

        point.pointUp();
        point.pointUp();
        point.pointUp();
        point.showPoint();

        point.pointUp();
        point.pointUp();
        point.showPoint();
        // 필드에 직접 접근
        System.out.println("point 필드 직접 접근 수정");

    }
}

package access;

public class Point {
    private int point;

    Point(int point) {
        this.point = point;
    }

    void pointUp() {
        if (point >= 10000) {
            System.out.println("포인트를 적립할 수 없습니다. 최대 포인트입니다.");
        } else {
            point += 1000;
            System.out.println(" 1000 포인트를 증가합니다.");
        }
    }
    void pointDown() {
        point -= 1000;
        System.out.println("pointDown 호출");
    }

    void showPoint() {
        System.out.println("현재 포인트 : " + point);
    }
}

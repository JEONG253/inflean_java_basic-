package poly.ex.pay1;

public abstract class PayStore {

    // 변하는 부분
    public static Payment findPayment(String option) {
        boolean result = false;
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("new")) {
            return new NewPay();
        } else {
            return new DefaultPay();
        }
    }
}

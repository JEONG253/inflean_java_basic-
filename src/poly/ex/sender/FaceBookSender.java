package poly.ex.sender;

public class FaceBookSender implements Sender{

    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북에 보냅니다 : " + message);
    }
}

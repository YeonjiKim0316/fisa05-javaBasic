package paymentEx;

public class NaverPayPayment extends Payment implements Refundable{

    static String paymentBy ="네이버페이";
    double point = 0;

    NaverPayPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println(paymentBy+"로" + displayAmount()  +  "를 결제합니다.");
    }

    @Override
    public void refund() {
        System.out.println(paymentBy + "로" + displayAmount() +  "를 "+ paymentBy+ "계좌로 환불합니다.");
    }

    // 네이버페이로 결제시에만 포인트가 쌓이고, 그 포인트를 확인 가능한 메서드
    public double getPoint(){
        return this.point;
    }
}

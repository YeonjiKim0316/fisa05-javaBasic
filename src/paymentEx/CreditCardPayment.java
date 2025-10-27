package paymentEx;

public class CreditCardPayment extends Payment implements Refundable{

    static String paymentBy ="신용카드";

    CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println(paymentBy+"로" + displayAmount()  +  "를 결제합니다.");
    }

    @Override
    public void refund() {
        System.out.println(paymentBy + "로" + displayAmount()  +  "를 "+ paymentBy+ "계좌로 환불합니다.");
    }
}

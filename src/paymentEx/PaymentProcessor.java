package paymentEx;

public class PaymentProcessor {

    // 클래스 메서드로 선언
    static void process(Payment payment) {
        payment.displayAmount(); // 결제금액 보여주고
        payment.processPayment(); // 실제 결제 진행하는 순서
    }
}

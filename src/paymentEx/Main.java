package paymentEx;

// 12시 30분까지
public class Main {
    public static void main(String[] args) {
        // 신용카드와 NaverPay 결제 객체 생성

        // List list1 = new ArrayList
        Payment creditCard = new CreditCardPayment(50000); // 업캐스팅
        Payment naverPay = new NaverPayPayment(30000);

//        naverPay.getPoint(); // 는 자식클래스 NaverPayPayment로만 사용가능

        // 결제 처리 (정적 메서드 사용)
        PaymentProcessor.process(creditCard);
        PaymentProcessor.process(naverPay);

        System.out.println();

        // 환불 기능 테스트 (다운캐스팅 사용)
        // instanceof 연산자는 객체가 null인 경우 false를 반환합니다.
        // instanceof 연산자를 사용하여 타입을 확인한 후, 안전하게 다운캐스팅할 수 있습니다.
        if (creditCard instanceof Refundable) {
            ((Refundable) creditCard).refund(); // (int) str
        }

        if (naverPay instanceof Refundable) {
            ((Refundable) naverPay).refund();
        }

        // naverPay 로 얼마, credit카드로 얼마
    }
}
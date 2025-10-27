package paymentEx;
/*
- 모든 결제 수단이 가져야 할 **공통 속성**과 **기능**을 정의합니다.
1. **필드**:
    - `amount` (double): 결제 금액 (**접근 제어자** 사용)
2. **메서드**:
    - **추상 메서드** `processPayment()` – 결제를 처리합니다.
    - **일반 메서드** `displayAmount()` – 결제 금액을 출력합니다.
3. **정적 필드**와 **정적 메서드**를 사용해 **전체 결제 건수(count) **를 관리합니다.

구상메서드, abstract로 선언한 추상메서드
 */
public abstract class Payment {

    static int count = 0; // 전체 결제 건수를 저장할 정적 변수
    private double amount; // private 접근제어자는 자기 클래스 안에서만 사용 가능

    // 추상클래스에는 생성자 작성이 가능합니다.
    Payment(double amount) {
        this.amount = amount;
        count++;
    }

    // 추상메서드
    abstract void processPayment();

    public double displayAmount() {
        return this.amount;
    }

    // 전체 결제건수를 확인할 정적 메서드
    public static int getCount() {
        return count;
    }
}

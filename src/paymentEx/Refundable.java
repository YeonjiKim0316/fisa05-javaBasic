package paymentEx;

/*
### **2. 인터페이스 - `Refundable`**   v

- **환불 기능**을 제공해야 하는 결제 수단을 구분합니다.
1. **메서드**:
    - `refund()` – 결제를 환불합니다.
 */
public interface Refundable {

    void refund(); // 기준이 추상이므로 abstract라는 키워드를 쓸 필요가 없습니다.
}

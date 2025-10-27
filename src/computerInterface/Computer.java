package computerInterface;

// 추상클래스와 마찬가지로 상속받은 자식클래스에서 실제 동작을 채워넣어야 합니다.
// 점검표 역할을 하게 된다
// 생성자 정의 불가능 - 자식클래스에서 재정의해줘야 하기 때문에
public interface Computer {

    // 전원
    // 절대 바뀌지 않을 상수들만 구체적으로 대입해서 작성해 둘 수 있습니다.
    String power = "off";

    // 추상메서드 - abstract가 기본 키워드로 삽입됩니다. (생략가능)
   void powerOn();
   void powerOff();

    // 구상메서드를 작성할 때는 접근제어자 defaul만 허용
    default void login() {
        System.out.println("로그인 완료");
    }

    // 순서를 정의하는 메서드
    // 특정 함수들의 순서를 고정해서 사용하기 위해 정의하는 메서드
    default void run() {
        powerOn();
        login();
        System.out.println("작업 중...");
        powerOff();
    }
}

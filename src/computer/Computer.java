package computer;

// 추상클래스 - 상속을 받아서 이용할 기능들을 점검(추상적으로)하기 위한 추상메서드들을 함수시그니처만 작성
// 구상메서드, 구상변수 등을 함께 적어줄 수 있습니다.
// 추상으로 적어놓을 메서드에 대해서는 abstract 라는 키워드로 구분합니다.
public abstract class Computer {

    String power;

    // 생성자
    Computer() {
        this.power = "off";
    }
    
    // 구상메서드 
    void login() {
        System.out.println("로그인 완료");
    }

    // 추상메서드
    abstract void powerOn();
    abstract void powerOff();

    // 특정 함수들의 순서를 고정해서 사용하기 위해 정의하는 메서드
    // final : 자식클래스에서 재정의가 불가능한 '최종 메서드'로 남아있게 됩니다.
    final void run() {
        powerOn();
        login();
        System.out.println("작업 중...");
        powerOff();
    }
}

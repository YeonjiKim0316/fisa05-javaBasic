package oop;

// 부모클래스를 상속받아서 재사용하기 위해서 extends 라는 명령어를 사용합니다.
public class AIStudent extends Student {

    AIStudent() {
        // 부모의 메서드를 그대로 사용할 때
    }

    // 인수를 받는 생성자는 직접 작성
    AIStudent(String name, String className) {
        // 부모의 메서드를 그대로 사용할 때
        super(name, className);
    }

    // enter라는 인스턴스 메서드를 this.name이 입실했습니다.
    @Override // 컴파일러가 부모클래스에 같은 이름으로 된 메서드가 있는지를 미리 확인해주도록 하는 어노테이션
    public void enter(){
        super.enter();
        System.out.println(this.name + "이"); // 자식클래스의 메서드에서 부모클래스의 메서드를 재정의
    }

    public void lateRule() {
        System.out.println("지각비를 걷습니다");
    }
}

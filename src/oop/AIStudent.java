package oop;

// 부모클래스를 상속받아서 재사용하기 위해서 extends 라는 명령어를 사용합니다.
public class AIStudent extends Student {

    // 인수를 받는 생성자는 직접 작성
    AIStudent(String name, String className) {
        // 부모의 메서드를 그대로 사용할 때
        super(name, className);
    }
}

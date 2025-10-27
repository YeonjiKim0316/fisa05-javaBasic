package oop2;

/*
접근 제어자	같은 클래스의 멤버	같은 패키지의 멤버	자식 클래스의 멤버	그 외의 영역
public	○	○	○	○
protected	○	○	○	X
default	○	○	X	X
private	○	X	X	X
*/
// class 단위에서는 public과 default의 접근제어자만 가능
public class MyProtected {

    protected String msg = "protected 변수"; // 인스턴스 변수

    protected void print() {
        System.out.println(this.msg); // 인스턴스 메서드
    }
}

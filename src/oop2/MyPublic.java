package oop2;

/*
접근 제어자	같은 클래스의 멤버	같은 패키지의 멤버	자식 클래스의 멤버	그 외의 영역
public	○	○	○	○
protected	○	○	○	X
default	○	○	X	X
private	○	X	X	X
*/
public class MyPublic {

    public String msg = "퍼블릭변수"; // 인스턴스 변수

    public void print() {
        System.out.println(this.msg); // 인스턴스 메서드
    }
}

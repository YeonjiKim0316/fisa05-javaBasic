package oop2;

/*
접근 제어자	같은 클래스의 멤버	같은 패키지의 멤버	자식 클래스의 멤버	그 외의 영역
public	○	○	○	○
protected	○	○	○	X
default	○	○	X	X  -> 생략했을 때 저절로 컴파일러가 넣어줍니다.
private	○	X	X	X
*/
// class 단위에서는 public과 default의 접근제어자만 가능
public class MyPrivate {

    private String msg = "private 변수"; // 인스턴스 변수

    private void print() {
        System.out.println(this.msg); // 인스턴스 메서드
    }

    public String print2() {
        return this.msg;  // private 변수를 자기 클래스 안에서만 사용함
    }
}

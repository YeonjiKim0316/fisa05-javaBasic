package oop;

import oop2.MyMyPublic;
import oop2.MyProtected;
import oop2.MyPublic;

public class Main {
    public static void main(String[] args) {
        Student kim = new Student("김연지");
        kim.enter();
        System.out.println(kim.exit());
        kim.studentNo(); // 클래스 메서드인데 인스턴스로 접근
//
        Student.studentNo();  // 클래스 메서드라 클래스로 접근
        int a = 1;
        Integer.valueOf(a); // 클래스메서드    str.find('사과나무', '무'); '사과나무'.find('무');
        System.out.println(kim);
//
        Student lim = new Student();
        AIStudent.studentNo(); // 부모의 클래스메서드를 상속받아서 사용 가능

        AIStudent chae = new AIStudent(); // 기본생성자를 컴파일러가 넣어주는 거
        chae.enter(); // 부모클래스의 인스턴스메서드를 재사용 - override

        AIStudent lee = new AIStudent("이지연", "AI반");
        lee.enter();
        System.out.println(lee.exit());
//
//        Student shin = new Student("신짱구", "AI반");

        MyPublic myPublic = new MyPublic();
        myPublic.print();
        System.out.println(myPublic.msg);

        MyProtected myProtected = new MyProtected();
        // protected로 선언해둔 msg, print() 둘 다 접근 불가
        // myProtected.print();

        // MyDefault는 default 패키지이므로 클래스도 접근 불가

    }
}

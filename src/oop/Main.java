package oop;

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

    }
}

package oop;

public class Main {
    public static void main(String[] args) {
        Student kim = new Student("김연지");
        kim.enter();
        System.out.println(kim.exit());
        kim.studentNo(); // 클래스 메서드인데 인스턴스로 접근

        Student.studentNo();  // 클래스 메서드라 클래스로 접근
        System.out.println(kim);

        AIStudent lee = new AIStudent("이지연", "AI반");
        lee.enter();
        System.out.println(lee.exit());

        Student shin = new Student("신짱구", "AI반");

    }
}

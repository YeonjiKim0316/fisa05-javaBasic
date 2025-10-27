package oop;

// 클래스 메서드, 클래스 변수 - 인스턴스를 찍어내지 않고서 바로 Student.속성  / Student.메서드명() ;
// 인스턴스 메서드, 인스턴스 변수 - 인스턴스마다 고유하게 가지게 되는 속성/기능 kim.속성 / kim.메서드명();
// public - protected - default - private 으로 각 변수/함수의 접근범위를 지정할 수 있습니다. 생략하면 default
public class Student {

    // 인스턴스 변수를 선언
    public String className;
    public String name;

    // 오버로딩 (메서드를 만들 때 다른 파라미터를 사용하면 다른 방식으로 동작하도록 몇개든지 같은 함수명을 사용
    // - 함수 헤더로 관리되므로 가능)
    //  new Student() 개발자가 클래스에 생성자 함수를 만들어주지 않으면 컴파일러가 기본값으로 아무것도 입력받지 않는 생성자를 만들어줍니다.
    Student() { // new Student()
    }

    // 자바에서 생성자(constructor) 함수를  작성할 때는 클래스명과 같은 메서드를 사용합니다.
    Student(String name) { // new Student("김연지")
        this.name = name; // this 라는 키워드로 인스턴의 메모리주소를 전달합니다.
    }

    Student(String name, String className) { // new Student("김연지", "AI반")
        this.name = name; // this 라는 키워드로 인스턴의 메모리주소를 전달합니다.
        this.className = className;
    }

    // 클래스 메서드 - static
    public static void studentNo() {
        System.out.println("100명의 수강생이 있습니다.");
    }


    // 인스턴스 메서드 
    public void enter() {
        System.out.println("입실했습니다");
    }

    // 인스턴스 메서드로 exit 메서드를 작성  return this.name + "이 퇴실합니다." String으로
    String exit() {
        return this.name+"이 퇴실합니다";
    }
}

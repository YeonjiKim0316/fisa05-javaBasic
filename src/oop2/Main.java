package oop2;

public class Main {
    public static void main(String[] args) {
        MyPublic myPublic = new MyPublic();
        myPublic.print();
        System.out.println(myPublic.msg);

        MyMyPublic myMyPublic = new MyMyPublic();
//        myMyPublic.print();
//        System.out.println(myMyPublic.msg);

        MyProtected myProtected = new MyProtected();
        myProtected.print();
        System.out.println(myProtected.msg);

        System.out.println("default ----------------------");
        MyDefault myDefault = new MyDefault();
        myDefault.print();
        System.out.println(myDefault.msg);

        System.out.println("private ----------------------");
        MyPrivate myPrivate = new MyPrivate();
        // 클래스 바깥에서 myPrivate.print() 는 사용 불가
//        System.out.println(myPrivate.msg);  myPrivate.msg는 사용 불가
        System.out.println(myPrivate.print2()); // 외부에서 public으로 선언한 메서드로 값을 확인 가능
    }
}

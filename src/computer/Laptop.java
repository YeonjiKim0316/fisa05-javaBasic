package computer;

public class Laptop extends Computer {
    @Override
    void powerOn() {
        System.out.println("키보드 맨 위에 있는 power키로 켠다");
    }

    @Override
    void powerOff() {
        System.out.println("키보드 맨 위에 있는 power키로 끈다");

    }
}

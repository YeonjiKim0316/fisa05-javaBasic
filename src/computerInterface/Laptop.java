package computerInterface;

// interface를 상속받아서 사용하는 것을 구현(implements)이라고 부릅니다
public class Laptop implements Computer {
    @Override
    public void powerOn() {
//        this.power = "on"; //
        System.out.println("노트북 키보드에 있는 " + this.power +  "버튼을 켭니다");
    }

    @Override
    public void powerOff() {
        System.out.println("노트북 키보드에 있는 " + this.power +  "버튼을 끕니다");
        
    }

    @Override
    public void run() {
        Computer.super.run();
        System.out.println("모니터 전원도 저절로 꺼집니다");
    }
}

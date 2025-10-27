package computer;

public class Desktop extends Computer {
    @Override
    void powerOn() {
        System.out.println("본체에 딸린 버튼으로 시작한다");
    }

    void powerOff() {
        System.out.println("본체에 딸린 버튼을 끈다");

    }

//    @Override
//    void run() {
//        super.run();
//        System.out.println("모니터의 전원도 끈다");
//    }
}

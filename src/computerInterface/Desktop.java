package computerInterface;

// interface를 상속받아서 사용하는 것을 구현(implements)이라고 부릅니다
public class Desktop implements Computer {
    @Override
    public void powerOn() {
//        this.power = "on"; //
        System.out.println("본체에 딸린 버튼을 켭니다");
    }

    @Override
    public void powerOff() {
        System.out.println("본체에 딸린 버튼을 끕니다");
        
    }
}

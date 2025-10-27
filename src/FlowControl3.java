import com.sun.tools.jconsole.JConsoleContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FlowControl3 {
    public static void main(String[] args) {
        // 반복문 - 집합자료형이랑 같이 사용됩니다.
        // 1. for -> 횟수를 알 경우
        /*
        for (초기값; 조건식; 증감식) {
            반복이 끝날 때까지 실행될 실행문
        }
         */
        for (int i = 1; i <= 10; ) {
            System.out.println(i++);
        }
        // 2. while -> 횟수가 정해지지 않은 : 1~10을 출력하는 while문을 작성
        /*
        바깥에 판별식을 언젠가 끝낼 초기값
        while(판별식) {
        		참일 때 실행문
            판별식을 바꿀 조건식
        }
        */
//        int i = 1;
//        while (i <= 10) {
//            System.out.println(i++);
//        }
        System.out.println("-------------------------------------------------------------");
        // 배열(Array)의 경우에 length / 가변참조형(ArrayList) .size() 라는 메서드로 길이를 확인할 수 있습니다.
        String[] cheese = {"cheddar", "gouda", "edam", "provolone", "parmesan"};
        ArrayList<String> cheeseList = new ArrayList<>(Arrays.asList("cheddar", "gouda", "edam", "provolone", "parmesan"));

        // 각 방의 원소 + 치즈 먹고 싶다 를 출력해보세요.
        // 방번호를 경유해서 해당 방의 원소를 호출
        for (int i = 0; i < cheese.length; i++) {
            System.out.println(i + cheese[i]);
        }

        for (int i = 0; i < cheeseList.size(); i++) {
            System.out.println(i + cheeseList.get(i));
        }

        System.out.println("--------------------------------------");
        // for ~ each 문을 사용해서 방번호 없이 직접 원소를 호출해서 사용
        for (String chee : cheese) {
            System.out.println(chee);
        }
        System.out.println("------------------------------------------");
        for (String chee : cheeseList) {
            System.out.println(chee);
        }

        System.out.println("-------------------for - if -----------------------");
        // break = 만나면 전체 반복문을 종료 / continue - 만나면 이번 한번만 아래 실행문을 skip
        for (String chee : cheeseList) {
            //  "gouda"를 만나면 반복문을 종료하도록
            if (chee.equals("gouda"))  continue;
            System.out.println(chee);
        }




    }
}

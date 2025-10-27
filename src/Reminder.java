import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Reminder {
    public static void main(String[] args) {
        // 배열(Array) : 고정 길이, 고정 자료형
        // 1. 방만 만들어놓고 -> 자기가 알아서 초기화를 하면서 자료형에 맞는 default 값을 넣어준다
        String[] arr = new String[5];
        arr[1] = "안녕하세요";
        System.out.println(arr[1]); // 수정, 조회는 가능하지만 삭제/삽입은 불가능
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------");
        // ArrayList : 가변 길이, 가변자료형이기 때문에 <자료형>을 선언해서(제너릭) 자료형을 고정해서 사용
        ArrayList<String> arrL = new ArrayList();
        arrL.add("가");
        arrL.add("true");
        arrL.set(1, "나비"); // 수정
        System.out.println(arrL.get(1));
        arrL.remove(0);
        System.out.println(arrL);


        System.out.println("--------------------------------------------");
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("가나다", 1);
        map1.put("가나다", 2);
        map1.put("나다라", 3);
        System.out.println(map1);
        System.out.println(map1.get("가나다"));
        System.out.println(map1.size()); // 원소의 개수
        System.out.println(arrL.size()); // 원소의 개수

    }

}


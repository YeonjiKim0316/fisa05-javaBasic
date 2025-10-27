import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataType2 {
    public static void main(String[] args) {
        // 배열 - Array
        // 방 개수가 고정, 각 방에 똑같은 자료형만 넣을 수 있습니다.
        // int a = 3;

        // 방번호로 해당 원소를 r, u 할 수 있다.

        // 1. 값을 넣으면서 배열을 만든다.
         int[] arr = {1, 2, (int)3.67}; // 형변환시 실수 -> 정수는 소수점이하 버림
        // arr의 2라는 값을 12로 바꾸고 확인해보세요.
        arr[1] = 12;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
        // 2. 빈 방을 만들고 나중에 값을 채운다.
         int[] arr2 = new int[3];
         int a;

        System.out.println(Arrays.toString(arr2)); // 기본값으로 0을 할당해서 배열을 돌려줍니다.

        // double 은 0.0을 기본값으로 할당, boolean은 false 기본값으로 할당
//        String str1 배열 "가위", "나비", "다람쥐"를 넣으시고, "다래"로 마지막 값을 바꿔보세요.
        String[] str1 = new String[3]; // null을 기본값으로 선언
        System.out.println(Arrays.toString(str1));
        str1[0] = "가위";
        str1[1] = "나비";
        str1[2] = "다람쥐";
//        str1[3] = "라일락"; // Index 3 out of bounds for length 3
        System.out.println(Arrays.toString(str1));

        // ArrayList - Array를 List의 방식으로 쓰는 가변 자료형입니다.
        List arr3 = new ArrayList();
        // 넣고빼기 쉽게 하기 위해서 add라는 메서드로 방을 삽입하고, remove라는 메서드로 방을 삭제 (메모리주소만 일괄적으로 관리하는 자료형)
        arr3.add("가나다");
        arr3.add(3.14);
        arr3.add(true);
        arr3.add(3);
        System.out.println(arr3);
        arr3.remove(true);
        arr3.remove(2);
        System.out.println(arr3);
        System.out.println(arr3.get(0)); // 조회도 get 명령어로
        arr3.set(0, "마바사"); // 수정은 set(방번호, 변경할 값)
        System.out.println(arr3);

        // Generic으로 방의 길이는 가변적으로 사용하되, 자료형을 고정해서 사용합니다. <자료형고정>
        List<String> arr4 = new ArrayList<String>();
        List<String> arr5 = new ArrayList<>();
        System.out.println(arr4);
        arr4.add("가나다");
        arr4.add("마바사"); // 삽입
        arr4.set(1, "라마바"); // 수정
        System.out.println(arr4);
        System.out.println(arr4.get(0));
        arr4.remove(0);
        System.out.println(arr4);
        System.out.println(arr4.remove("라마바"));
        System.out.println(arr4);
        }
    }

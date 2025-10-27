import java.util.*;

public class DataType3 {
    public static void main(String[] args) {
        // HashMap: key-value 의 파이썬의 dictionary와 유사한 자료구조
        // Map이 본체, Hash라는 구현방식(알고리즘)으로 사용
        // 하나의 key에 하나의 value가 매핑이 되고, key로 바로 값을 찾기 때문에 속도가 빠르다.
        // 검색 / 삽입 / 삭제가 빈번한 자료들. 대규모 데이터에 적합하다.
        Map<String, String> map = new HashMap(); // <key의자료형, value의 자료형>
        map.put("가", "가위");
        map.put("나", "나비"); // 삽입
        System.out.println(map);
        System.out.println(map.get("가")); // 특정 원소 조회
        map.replace("가", "가랑비"); // 수정

        System.out.println(map);
        map.remove("나");
        System.out.println(map);
        System.out.println(map.getOrDefault("다", "찾는 값이 없습니다"));
        map.put("가", "가위");
        map.replace("다", "다람쥐"); // 있는 값에 대한 수정 - 없는 값은 삽입하지 않습니다.
        System.out.println(map);

        System.out.println(map.keySet()); // 키만
        System.out.println(map.values()); // value만
        System.out.println(map.entrySet()); // key-value 쌍으로
        System.out.println(map.containsKey("가")); // key로 값 찾기
        System.out.println(map.containsValue("가랑비")); // value로 값 찾기

        // Set - 중복을 허용하지 않는 자료형
        Set<String> set1 = new HashSet<>();
        set1.add("김연지");
        set1.add("김연지");
        set1.add("김인지");
        System.out.println(set1); // 중복불가
        System.out.println(set1.contains("김연지")); // 포함여부
        System.out.println(set1.size()); // 원소의 개수 map, arrayList도 같음

        // Language라는 enum 타입으로만 값을 강제하는 ArrayList
        List<Language> languages = new ArrayList<>();
        languages.add(Language.PYTHON); // enum명.값
        languages.add(Language.HTML);
        System.out.println(languages); // case 문과 함께 주로 사용합니다.

    }
}

// enum - 같은 값을 강제해서 받을 때: M/man/Man/남자/남성 -> M / F
// enum은 문자열로 작성하지만, 개념적으로 상수(고정된 값)을 사용

enum Language {
    JAVA, PYTHON, JS, HTML, SQL // 대문자로 enum 타입을 작성
}

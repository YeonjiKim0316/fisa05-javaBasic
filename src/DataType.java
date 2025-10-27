import java.util.Arrays;

public class DataType {
    // 주석
    /* 여러
    줄
            주석
             def void(param1, param2):
                 print('hello)
                 return 'hello';
     */
    public static void main(String[] args) {
        // 정수 - int(4바이트, 기본) / long(8바이트)
        int a = 1;
        long b = 1L; // 대문자로 L 로 구분해서 작성해줍니다.

        // 실수 - 부동소수점 관리 double(8바이트, 기본) / float(4바이트)
        double c = 3.14;
        float d = 3.14F;

        // 문자 - UTF-16 char (1글자, 2바이트) ' ' / 문자열(집합자료형) String  " "
        char f = '가';

        // boolean - true, false (1바이트)
        boolean g = true;

        // Ctrl + D  - 한줄 복제 / Ctrl + X - 한줄 삭제

        System.out.println(a+b); // int + long -> long
        System.out.println(b+c); //  long  + double -> double
        System.out.println(c+d); // double + float -> double (더 큰 바이트의 방)
        System.out.println(d+f); // float + char -> 에러
//        System.out.println(f+g); // char + boolean
//        System.out.println(g+a); // boolean + int

        String h = "가나다";
        System.out.println(f+h);
        String i = "가나다";
        // == 객체의 메모리 주소(같은 방에서 참조됐는지)를 비교하는 연산자
        // 기존에 있던 값을 다시 새로운 변수에 할당하게 된다면 처음에는 메모리주소를 가리킵니다.
        System.out.println(a==b); // true
        System.out.println(h==i); // true
        // 새로 할당되면 그제서야 다른 방을 가리킵니다. - 문자열에 대해서 String Pool
        i = "마바사";
        System.out.println(h==i); // false
        // new 키워드로 아예 처음부터 새로운 메모리주소에 값을 넣어주세요. 라고 선언할 수 있습니다.
        String j = new String("가나다");
        System.out.println(h==j); // false

        String l = "그대로\n이 문자\n넣으세요.";
        System.out.println(l);

        String k = """
        그대로 0
        이 문자를
        넣으세요.""";
        System.out.println(k);

        System.out.println("--------------------------------");
        // replace, split, charAt, indexOf, contains, f-string(format)
        System.out.println(k.replace("이", "그"));
        System.out.println(Arrays.toString(k.split(" "))); // [Ljava.lang.String;@1ddc4ec2  - [L(ist), java.lang.String (자료형), @  1ddc4ec2(메모리주소)
        System.out.println(k.charAt(0)); // 자바도 0부터 배열 순서 시작, 음수 인덱싱은 허용하지 않는구나
        System.out.println(k.indexOf("문자")); // -1 은 없음을 의미하는 리턴값, 시작하는 방번호
        System.out.println("------------");
        System.out.println(k.indexOf("0"));
        int unicode = '로'; // '로'의 유니코드 번호가 반환
        System.out.println(unicode);
        System.out.println(k.indexOf(47196));
        System.out.println(k.contains("상형문자"));   // 있으면 true, 없으면 false를 리턴

        // format f'나는 어제 {time}분의 {app}를 봤다.'   %s : String의 자리. %d : 십진법 정수의 자리, %f : 십진법 실수의 자리
        System.out.println(String.format("나는 어제 %f분의 %s를 봤다.", 50.0, "유튜브"));
        // Hello i AM shingjjangu. m이라는 변수에 집어넣고, uppercase / lowercase
        String m = "Hello i AM shingjjangu";
        System.out.println(m.toUpperCase());
        System.out.println(m.toLowerCase());

        // equals - 완전항등연산자 (값과 자료형이 모두 일치하는지 비교)
        String old = "1";
        int new_ = 1;
        System.out.println(old.equals(new_)); // 값은 일치하지만 자료형이 다르므로  false
    }
}

public class FlowControl1 {
    public static void main(String[] args) {
        // 조건문: if~else if~else / switch~case / 삼항연산자
        // int num = 값;  해당 값이 짝수이면 짝수, 홀수이면 홀수라고 콘솔에 결과를 출력하는 if문을 하나 만들어주세요.

        // 1. - if (판별할 식) {  조건을 만족할 경우 실행문  }  ~ else if ~ else 구문 : 범위가 있는 조건
//        int num = 1;
//
//        if (num % 2 == 0) {
//            System.out.println("짝수");
//        } else {
//            System.out.println("홀수");
//        }

        System.out.println("-------------------------------");
        int num =1;

        // 2. - switch - case : 단일 조건
        switch (num % 2) {
            case  0:
                System.out.println("짝수");
                break; // 실행문 아래 부분을 실행하지 않고 강제 종료
            default: // else의 경우 대신함
                System.out.println("홀수");
        }

        // () -> { } : 대신에 break 생략 가능
        switch (num % 2) {
            case  0 -> { // 실행문이 여러개인 경우  { } 안에 작성합니다
                System.out.println("짝수");
            }
            default -> System.out.println("홀수");
        }

        // 3. 삼항연산자  (판별식) ? 참일 때 실행문 : 거짓일 때 실행문
        System.out.println("-------------------------------------------");
        num = 1;
        System.out.println( (num % 2==0) ? "짝수" : "홀수" );
    }

}

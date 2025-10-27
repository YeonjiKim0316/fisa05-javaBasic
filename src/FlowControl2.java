import java.util.NoSuchElementException;
import java.util.Scanner;

public class FlowControl2 {
    public static void main(String[] args) {
        // 조건문: if~else if~else / switch~case / 삼항연산자
        // 숫자를 문자열로 입력받아서 짝수 - 짝수, 홀수 - 홀수, 소문자/대문자 q를 입력하면 종료를 출력하는 조건문.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("짝수/홀수 판별기. q/Q는 종료 가능");
//        String num = sc.next(); // 문자열로 값 입력 받음

//        // 1. - if (판별할 식) {  조건을 만족할 경우 실행문  }  ~ else if ~ else 구문 : 범위가 있는 조건
//        // 숫자를 문자열로 입력받아서 짝수 - 짝수, 홀수 - 홀수, 소문자/대문자 q를 입력하면 종료를 출력하는 조건문.
//
//        // q/Q 를 확인: ==은 같은 메모리주소에서 값이 나오는지 확인하기 때문에 문자열의 경우 equals 라는 명령어로 값/자료형 일치를 비교합니다.
//        if ( num.equals("q") ) {
//            System.out.println("q 종료");
//        } else if (num.equals("Q")) {
//            System.out.println("Q 종료");
//        } else {
//            // num을 int로 형변환
//            // String은 집합자료형: 메모리 주소로 관리, int는 기본자료형: 값 자체로 관리
//            // 자바 컴파일러에 편의를 제공하기 위해 int -> Integer / double -> Double 의 wrapper class로 감싸서 형변환을 하게 됩니다.
//            int num2 = Integer.valueOf(num);
//            // 짝수이면 짝수 홀수이면 홀수
//            System.out.println("짝수/홀수 판별");
//
//            if (num2 % 2 ==0) {
//                System.out.println("짝수");
//            } else {
//                System.out.println("홀수");
//            }
//        }
//
//        System.out.println("-------------------------------");
//        // && (and), || (or), ! (not)
//        if ( num.equals("q") || num.equals("Q") ) {
//            System.out.println("q/Q 종료");
//        } else { // NumberFormatException
//            int num2 = Integer.valueOf(num);
//            // 짝수이면 짝수 홀수이면 홀수
//            if (num2 % 2 ==0) {
//                System.out.println("짝수");
//            } else {
//                System.out.println("홀수");
//            }
//        }

        System.out.println("-------------3------------------");


        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("짝수/홀수 판별기. q/Q는 종료 가능");
            String num = sc.next(); // 문자열로 값 입력 받음
            // && (and), || (or), ! (not) - try { 정상 실행해야할 실행문 } catch { 예외가 발생하는 경우 } finally {정상이건 예외건 실행되어야 할 실행문}
            if (num.equals("q") || num.equals("Q")) {
                System.out.println("q/Q 종료");
            } else { // NumberFormatException
                int num2 = Integer.valueOf(num);
                if (num2 % 2 == 0) {
                    System.out.println("짝수");
                } else {
                    System.out.println("홀수");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException 종료");
        } catch (NoSuchElementException e) {
        System.out.println("NoSuchElementException 종료");
        } catch (Exception e) {
            System.out.println("Exception 종료");
        } finally {
                System.out.println("예외가 발생했건 정상 종료됐건 무조건 실행");
            }

        System.out.println("-------------4------------------");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("짝수/홀수 판별기. q/Q는 종료 가능");
            String num = sc.next(); // 문자열로 값 입력 받음

            try {

                // && (and), || (or), ! (not) - try { 정상 실행해야할 실행문 } catch { 예외가 발생하는 경우 } finally {정상이건 예외건 실행되어야 할 실행문}
                if (num.equals("q") || num.equals("Q")) {
                    System.out.println("q/Q 종료");
                } else { // NumberFormatException
                    int num2 = Integer.valueOf(num);
                    if (num2 % 2 == 0) {
                        System.out.println("짝수");
                    } else {
                        System.out.println("홀수");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException 종료");
            } catch (Exception e) {
                System.out.println("Exception 종료");
            } finally {
                System.out.println("예외가 발생했건 정상 종료됐건 무조건 실행");
            }
        } catch (NoSuchElementException e) {
            System.out.println("외부에 작성한 NoSuchElementException 종료");
        }
    }

}

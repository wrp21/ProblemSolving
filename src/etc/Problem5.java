package etc;

import java.time.LocalDate;
import java.util.Scanner;

/*
    과제 5.
    "달력 출력 프로그램"
    입력 받은 년도와 월을 통해 달력을 출력하는 프로그램 작성

    1. 입력받은 년도와 월을 통한 달력 생성
    2. 입력값은 년도, 월을 입력
    3. 날짜는 LocalDate 클래스를 이용(Calender와 Date 클래스도 이용 가능)

 */

public class Problem5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt(); sc.nextLine();
        System.out.print("달력의 월을 입력해 주세요.(mm):");
        int month =  sc.nextInt(); sc.nextLine();

        char[] weeks = new char[] {'일', '월', '화', '수', '목', '금', '토'};

        LocalDate calender = LocalDate.of(year, month, 1);

        System.out.println();
        System.out.println();
        System.out.printf("[%d년 %02d월]%n", year, month);

        for(char week: weeks) {
            System.out.printf("%c\t", week);
        }
        System.out.println();

        for(int i = 0; i < calender.lengthOfMonth(); i++) {
            LocalDate day = calender.plusDays(i);
            if(day.getDayOfMonth() == 1) {
                for(int j = 0; j < day.getDayOfWeek().getValue() ; j++) {
                    System.out.print(" \t");
                }
                System.out.printf("%02d\t", day.getDayOfMonth());
            } else {
                System.out.printf("%02d\t", day.getDayOfMonth());
                if(day.getDayOfWeek().getValue() == 6) {
                    System.out.println();
                }
            }
        }
    }
}

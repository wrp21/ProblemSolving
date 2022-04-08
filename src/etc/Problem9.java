

package etc;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.println("<<<<[메뉴선택]>>>>");
            System.out.println("1. 회원 관리");
            System.out.println("2. 과목 관리");
            System.out.println("3. 수강 관리");
            System.out.println("4. 결제 관리");
            System.out.println("5. 종료");

            number = sc.nextInt();
            sc.nextLine();
            String message = "";
            switch (number) {
                case 1:
                    message = "회원 관리 메뉴를 선택했습니다.";
                    break;
                case 2:
                    message = "과목 관리 메뉴를 선택했습니다.";
                    break;
                case 3:
                    message = "수강 관리 메뉴를 선택했습니다.";
                    break;
                case 4:
                    message = "결제 관리 메뉴를 선택했습니다.";
                    break;
                case 5:
                    message = "프로그램을 종료합니다.";
                    break;
                default:
                    message = "입력값이 정확하지 않습니다.";
                    break;
            }

            System.out.println(message);

        } while (number != 5);
    }
}

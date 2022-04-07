package etc;/*
    과제 2
    금액이 입력되었을 때 캐시백 계산하여 출력

    [캐시백 계산 조건]
    - 결재 금액의 10%를 적립한다.
    - 캐시백포인트 단위는 백원단위이다.
    - 한건의 캐시백 포인트는 최대 300원을 넘을 수 없습니다.
 */

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요. (금액):");
//        int inputCash = sc.nextInt(); sc.nextLine();
        int inputCash = Integer.parseInt(sc.nextLine());
        int tenPercentCash = (int)(inputCash * 0.1);
        int cashBack = tenPercentCash >= 300 ? 300 : (tenPercentCash / 100) * 100;

        System.out.println("결제 금액은 " + inputCash + "원이고, 캐시백은 " + cashBack + "원 입니다.");
    }
}

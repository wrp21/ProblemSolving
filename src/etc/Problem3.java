package etc;/*
    과제 3.
    나이, 입장시간, 국가유공자 여부 복지카드 여부 순으로 입력 받을 때
    할인 적용한 입장료 출력

    기본 입장료 : 1만원
    특별 할인 : 4천원 (13세 미만, 17시 이후 입장 고객)
    일반 할인 : 8천원 ( 복지카드, 국가 유공자)
    3세 미만 : 무료

 */
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int price = 0;

        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = sc.nextInt(); sc.nextLine();

        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int time = sc.nextInt(); sc.nextLine();

        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        char isPetriot = sc.nextLine().charAt(0);

        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        char hasWelfareCard = sc.nextLine().charAt(0);

        // 무료인 경우
        if (age < 3) {
            price = 0;
            // 특별 할인인 경우
        } else if (age < 13 || time >= 17) {
            price = 4000;
            // 일반 할인
        } else if (isPetriot == 'y' || hasWelfareCard == 'y') {
            price = 8000;
            // 기본 입장료
        } else {
            price = 10000;
        }

        System.out.println("입장료: " + price);
    }
}

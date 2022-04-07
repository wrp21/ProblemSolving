package etc;

import java.util.Random;
import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {

        Random numberGenerator = new Random();

        Scanner sc = new Scanner(System.in);

        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        String year = sc.nextLine();

        System.out.print("출생월을 입력해 주새요.(mm):");
        String month = sc.nextLine();

        System.out.print("출생일을 입력해 주세요.(dd):");
        String day = sc.nextLine();

        System.out.print("성별을 입력해 주세요.(m/f):");
        String sexType = "";
        switch (sc.nextLine()) {
            case "m": sexType = "3"; break;
            case "f": sexType = "4"; break;
            default: sexType = null; break;
        }

        // 주민번호 앞자리 : yymmdd
        String frontNumber = year.substring(2, 4) + month + day;

        String randomNumber = "";

        for(int i = 0; i < 6; i++) {
            randomNumber += String.valueOf(numberGenerator.nextInt(9));
        }

        // 주민번호 뒷자리 : 설별(m:3, f:4) + Random.nextInt를 통하여 생성한 임의의수
        String backNumber = sexType + randomNumber;

        System.out.println(frontNumber + "-" + backNumber);

    }
}

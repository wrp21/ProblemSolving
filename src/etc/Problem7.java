package etc;/*
    "로또 당첨 프로그램"
   1 ~ 45개의 숫자 사이의 값 중 6개를 맞추면 당첨되는 복권
   로또의 개수를 입력받고 당첨 번호를 생성한다.
   이후 구매한 로또의 당첨번호를 판단하는 프로그램 작성.
 */

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {

        Random lottoGenerator = new Random();

        Scanner sc = new Scanner(System.in);
        System.out.println("[로또 당첨 프로그램]");
        System.out.println();
        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
        int lottoNumber = sc.nextInt(); sc.nextLine();
        String[] lotto = new String[lottoNumber];
        int[] resultLotto = new int[6];
        HashSet<Integer> resultLottoSet = new HashSet<>();


        for(int i = 0; i < lottoNumber; i++) {
            System.out.printf("%c\t", (char)('A' + i) );
            lotto[i] = sc.nextLine();
        }

        for(int i = 0; i < resultLotto.length; i++) {
            resultLotto[i] = lottoGenerator.nextInt(45) + 1;
            resultLottoSet.add(resultLotto[i]);
        }

        System.out.println();
        System.out.println("[로또 발표]");
        System.out.print("\t");
        for(int i = 0; i < resultLotto.length; i++) {
            if(i != 5) {
                System.out.printf("%02d,", resultLotto[i]);
            } else {
                System.out.printf("%02d", resultLotto[i]);
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("[내 로또 결과]");

        for(int i = 0; i < lottoNumber; i++) {
            String[] lottoElements = lotto[i].split(",");
            int matchCount = 0;

            for (String element : lottoElements) {
                if (resultLottoSet.contains(Integer.parseInt(element))) {
                    matchCount++;
                }
            }

            System.out.printf("%c\t", (char)('A' + i));
            for(int j = 0; j < lottoElements.length; j++) {
                if(j != lottoElements.length -1) {
                    System.out.printf("%02d,", Integer.parseInt(lottoElements[j]));
                } else {
                    System.out.printf("%02d", Integer.parseInt(lottoElements[j]));
                }
            }
            System.out.printf(" => %d개 일치\n", matchCount);
        }
    }
}

package etc;/*
    과제 8.
    "연소득 과세금액 계산 프로그램"
    연 소득에 대한 소득세율표를 기준으로 소득에 대한 세금을 구하는 프로그램 작성
 */

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        int income = sc.nextInt(); sc.nextLine();
        int tax1 = 0;
        double tax2 = 0;

        int[] rangeArray = new int[]
                {
                        0, 12000000, 46000000, 88000000, 150000000, 300000000, 500000000, 1000000000
                };

        int[] subRangeArray = new int[rangeArray.length];

        for(int i = 1; i < rangeArray.length;i++) {
            subRangeArray[i] = rangeArray[i] - rangeArray[i-1];
        }

        double[] percentArray = new double[]
                {
                        0, 0.06, 0.15, 0.24, 0.35, 0.38, 0.4, 0.42, 0.45
                };
        int[] deductionArray = new int[]
                {
                        0, 1080000, 5220000, 14900000, 19400000, 25400000, 35400000, 65400000
                };

        int sum = 0;
        int index = 0;
        int extra = 0;

        for(int i = 1; i < subRangeArray.length; i++) {
            if((sum <= income) && ((sum + subRangeArray[i]) <= income)) {
                sum += subRangeArray[i];
                tax1 += (int)(subRangeArray[i] * percentArray[i]);
                index = i - 1;
                System.out.printf("%10d * %2d%% =\t%10d\n",
                        subRangeArray[i], (int)(percentArray[i] * 100), (int)(subRangeArray[i] * percentArray[i]));
            } else {
                extra = income - sum;
                tax1 += (int)(extra * percentArray[i]);
                System.out.printf("%10d * %2d%% =\t%10d\n",
                        extra, (int)(percentArray[i] * 100), (int)(extra * percentArray[i]));
                index = i - 1;
                break;
            }
        }

        if(income > 1000000000) {
            extra = income - sum;
            tax1 += (int)(extra * percentArray[percentArray.length-1]);
            index = subRangeArray.length-1;
            System.out.printf("%10d * %2d%% =\t%10d\n",
                    extra,
                    (int)(percentArray[percentArray.length-1] * 100),
                    (int)(extra * percentArray[percentArray.length-1]));
        }

        System.out.println();
        System.out.printf("[세율에 의한 세금]:        \t%d \n", tax1);
        if(income > 12000000) {
            tax2 =  (income * percentArray[index+1]) - deductionArray[index];
            System.out.printf("[누진공제 계산에 의한 세금]: %10.0f \n", tax2);
        } else {
            System.out.printf("[누진공제 계산에 의한 세금]: \t -\n ");
        }

    }
}


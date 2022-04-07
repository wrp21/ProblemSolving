package BackjunStep.Step1;

import java.util.Scanner;

public class No2588 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        String[] num2 = sc.nextLine().split("");
        int result[] = new int[num2.length];
        int sum = 0;
        int tempNum = 0;
        for(int i = 2; i >= 0; i--) {
            int ten = 1;
            tempNum = Integer.parseInt(num2[i]);
            System.out.println(tempNum * num1);
            for(int j = 0; j < num2.length - i; j++) {
                if(j > 0) {
                    ten *= 10;
                }
            }
            sum += (num1 * tempNum) * ten;


        }
        System.out.println(sum);
    }
}

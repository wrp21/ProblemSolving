package BackjunStep.Step2;

import java.util.Scanner;

public class No1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);
        String result;

        if(num1 < num2) {
            result = "<";
        } else if (num1 > num2) {
            result = ">";
        } else {
            result = "==";
        }

        System.out.println(result);

    }
}

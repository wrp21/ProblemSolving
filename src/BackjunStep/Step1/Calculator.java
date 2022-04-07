package BackjunStep.Step1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArray = sc.nextLine().split(" ");
        int num1 = Integer.parseInt(inputArray[0]);
        int num2 = Integer.parseInt(inputArray[1]);
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
    }
}

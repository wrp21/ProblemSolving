package BackjunStep.Step1;

import java.util.Scanner;

public class AMinusB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArray = sc.nextLine().split(" ");
        System.out.println(Integer.parseInt(inputArray[0]) - Integer.parseInt(inputArray[1]));
    }
}

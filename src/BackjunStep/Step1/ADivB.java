package BackjunStep.Step1;

import java.util.Scanner;

public class ADivB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArray = sc.nextLine().split(" ");
        System.out.println(Double.parseDouble(inputArray[0]) / Double.parseDouble(inputArray[1]));
    }
}

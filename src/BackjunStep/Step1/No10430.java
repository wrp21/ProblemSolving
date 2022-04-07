package BackjunStep.Step1;

import java.util.Scanner;

public class No10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArray = sc.nextLine().split(" ");
        int numA = Integer.parseInt(inputArray[0]);
        int numB = Integer.parseInt(inputArray[1]);
        int numC = Integer.parseInt(inputArray[2]);
        System.out.println( ((numA + numB) % numC) );
        System.out.println( (((numA % numC) + (numB % numC)) % numC) );
        System.out.println( ((numA * numB) % numC) );
        System.out.println( (((numA % numC) * (numB % numC)) % numC) );
    }
}

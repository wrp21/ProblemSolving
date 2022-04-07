package BackjunStep.Step3;

import java.util.Scanner;

public class No2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        for(int i = 1; i < 10; i++ ) {
            System.out.println(num + " * " + i + " = " + (num * i) );
        }
    }
}

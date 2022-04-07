package BackjunStep.Step3;

import java.util.Scanner;

public class No10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testNum = Integer.parseInt(sc.nextLine());
        String[] testCase = new String[testNum];
        for(int i = 0; i < testNum; i++) {
            testCase = sc.nextLine().split(" ");
            System.out.println(Integer.parseInt(testCase[0]) + Integer.parseInt(testCase[1]));
        }
    }
}

package BackjunStep.Step2;
import java.util.Scanner;

public class No2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int inputC = Integer.parseInt(sc.nextLine());
        int inputA = Integer.parseInt(input[0]);
        int inputB = Integer.parseInt(input[1]);

        int plusTime = inputC / 60;
        int plusMinute = inputC % 60;
        int resultTime = 0;
        int resultMinute = 0;

        resultMinute = inputB + plusMinute;

        if(resultMinute >= 60) {
            plusTime++;
            resultMinute = resultMinute - 60;
        }

        resultTime = inputA + plusTime;

        if(resultTime > 23) {
            resultTime %= 24;
        }

        System.out.println(resultTime + " " + resultMinute);

    }
}

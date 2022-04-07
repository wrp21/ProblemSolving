package BackjunStep.Step2;
import java.util.Scanner;

public class No2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int inputTime = Integer.parseInt(input[0]);
        int inputMinute = Integer.parseInt(input[1]);

        int subMinute = inputMinute - 45;
        int subTime = inputTime;
        if (subMinute < 0) {
            subTime--;
            if(subTime < 0) {
                subTime = 23;
            }
            subMinute = 60 + subMinute;
        }

        System.out.println(subTime + " " + subMinute);
    }
}

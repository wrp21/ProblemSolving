package BackjunStep.Step2;
import java.util.Scanner;

public class No2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(((input % 4 == 0) && (input % 100 != 0)) || ((input % 100 == 0) && (input % 400 == 0))) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

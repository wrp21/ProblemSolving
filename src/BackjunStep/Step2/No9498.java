package BackjunStep.Step2;
import java.util.Scanner;

public class No9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        char scoreAlpabet;

        if (score <= 100 && score >= 90) {
            scoreAlpabet = 'A';
        } else if (score <= 89 && score >= 80) {
            scoreAlpabet = 'B';
        } else if (score <= 79 && score >= 70) {
            scoreAlpabet = 'C';
        } else if(score <= 69 && score >= 60) {
            scoreAlpabet = 'D';
        } else {
            scoreAlpabet = 'F';
        }

        System.out.println(scoreAlpabet);

    }
}

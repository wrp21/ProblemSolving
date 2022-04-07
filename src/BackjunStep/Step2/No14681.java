package BackjunStep.Step2;
import java.util.Scanner;

public class No14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posX = Integer.parseInt(sc.nextLine());
        int posY = Integer.parseInt(sc.nextLine());
        int quadNum = 0;

        // posX, posY 는 0이 아나리는 전제조건이 있다.
        if(posX > 0) {
            if(posY < 0) {
                quadNum = 4;
            } else {
                quadNum = 1;
            }
        } else {
            if(posY < 0) {
                quadNum = 3;
            } else {
                quadNum = 2;
            }

        }

        System.out.println(quadNum);

    }
}

package BackjunStep.Step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2480 {
    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
//        String[] input = sc.nextLine().split(" ");
//        int num1 = Integer.parseInt(input[0]);
//        int num2 = Integer.parseInt(input[1]);
//        int num3 = Integer.parseInt(input[2]);


        // Scanner 보다 빨리 실행된다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());

        int result = 0;

        if(num1 == num2 && num2 == num3) {
            result = 10000 + num1 * 1000;
        } else if (num1 == num2 || num1 == num3) {
            result = 1000 + num1 * 100;
        } else if (num2 == num3) {
            result = 1000 + num2 * 100;
        } else {
            int max = 0;
            for(int num: new int[] {num1, num2, num3}) {
                if(max < num) {
                    max = num;
                }
            }
            result = max * 100;
        }

        System.out.println(result);

    }
}

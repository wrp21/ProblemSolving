package Backjun;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class No1934 {

    public static ArrayList<Integer> getDivisors(int num) {

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 1; i <= (int)num / 2; i++) {
            if(num % i == 0) {
                result.add(i);
            }
        }

        return result;
    }


    public static int getGCD(int num1, int num2) {
        int result = -1;

        ArrayList<Integer> num1Divisors = getDivisors(num1);
        ArrayList<Integer> num2Divisors = getDivisors(num2);

        for(Integer num1Divisor: num1Divisors) {
            for(Integer num2Divisor: num2Divisors) {
                if(num1Divisor.equals(num2Divisor)) {
                    if(result < num1Divisor) {
                        result = num1Divisor;
                    }
                }
            }
        }

        if(result == -1)  {
            result = 1;
        }

        return result;
    }

    public static int getLCM(int num1, int num2) {
        int result = -1;
        result = num1 * num2 / getGCD(num1, num2);
        return result ;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int num1 = 0, num2 = 0;
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());

            bw.write(getLCM(num1, num2) + "\n");

        }

        br.close();
        bw.flush();
        bw.close();
    }
}

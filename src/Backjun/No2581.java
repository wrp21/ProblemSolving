package Backjun;

import java.io.*;

public class No2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0, min = N + 1;

        if(M == 1) {
            M++;
        }

        boolean isPrime;

        for(int i = M; i <= N; i++) {
            isPrime = false;
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    isPrime = true;
                    break;
                }
            }

            if(!isPrime) {
                sum += i;
                if (min > i) {
                    min = i;
                }
            }
        }

        if(min != N + 1) {
            bw.write(sum + "\n" + min + "\n");
        } else {
            bw.write("-1\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

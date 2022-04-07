package BackjunStep.Step3;

import java.io.*;

public class No2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = N; i >= 1; i--) {
            for(int j = 1; j <= N; j++) {
                if(j >= i) {
                    bw.write("*");
                } else {
                    bw.write(" ");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}

package BackjunStep.Step3;

import java.io.*;
import java.util.StringTokenizer;

public class No15552 {
    public static void main(String[] args) throws IOException {
        int num1;
        int num2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testNumber = Integer.parseInt(br.readLine());

        for(int i = 0; i < testNumber; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            bw.write((num1 + num2) + "\n");
        }

        bw.flush();
        bw.close();
    }
}

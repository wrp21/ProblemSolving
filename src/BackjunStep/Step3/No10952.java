package BackjunStep.Step3;

import java.io.*;
import java.util.StringTokenizer;

public class No10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int sum;

        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            if(sum != 0) {
                bw.write(sum +"\n");
            } else {
                break;
            }
        }
        bw.flush();
        bw.close();

    }
}

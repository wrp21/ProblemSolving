package BackjunStep.Step3;

import java.io.*;
import java.util.StringTokenizer;

public class No11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            bw.write("Case #" + i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        bw.flush();
        bw.close();
    }
}

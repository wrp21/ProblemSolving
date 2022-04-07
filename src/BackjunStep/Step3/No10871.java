package BackjunStep.Step3;

import java.io.*;
import java.util.StringTokenizer;

public class No10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int token = 0;
        for(int i = 0; i < N; i++) {
            token = Integer.parseInt(st.nextToken());
            if(X > token) {
                bw.write(token + " ");
            }
        }

        bw.flush();
        bw.close();

    }
}

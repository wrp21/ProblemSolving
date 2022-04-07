package BackjunStep.Step4;
import java.io.*;
import java.util.StringTokenizer;

public class No1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double[] scoreArray = new double[N];
        double max = 0;
        double sum = 0;

        for(int i = 0; i < N; i++) {
            scoreArray[i] = Integer.parseInt(st.nextToken());
            if(max < scoreArray[i]) {
                max = scoreArray[i];
            }
        }

        for(int i = 0; i < N; i++) {
             sum += (scoreArray[i] / max * 100);
        }

        br.close();
        bw.write((sum /  N)+ "\n" );
        bw.flush();
        bw.close();
    }
}

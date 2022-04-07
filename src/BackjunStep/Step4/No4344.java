package BackjunStep.Step4;
import java.io.*;
import java.util.StringTokenizer;

public class No4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int C = Integer.parseInt(br.readLine());

        for(int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int stuNumber = Integer.parseInt(st.nextToken());
            int sum = 0;
            int over = 0;
            int[] scoreArray = new int[stuNumber];

            for(int j = 0; j < stuNumber; j++) {
                scoreArray[j] = Integer.parseInt(st.nextToken());
                sum += scoreArray[j];
            }

            double avg = (double) sum / stuNumber;

            for(int ele: scoreArray) {
                if (ele > avg) {
                    over++;
                }
            }
            bw.write(String.format("%.3f%%\n", (over / (double)stuNumber * 100)));
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

package BackjunStep.Step4;
import java.io.*;
import java.util.StringTokenizer;

public class No10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int max = Integer.parseInt(st.nextToken()), min = max;
        for(int i = 0; i < N - 1; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(max < temp) {
                max = temp;
            } else if(min > temp) {
                min = temp;
            }

        }

        bw.write(min + " " + max + "\n");
        bw.flush();
        bw.close();

    }
}

package BackjunStep.Step4;
import java.io.*;

public class No8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            String ans = br.readLine();
            int sumScore = 0;
            int count = 1;
            for(int j = 0; j < ans.length(); j++) {
                if(ans.charAt(j) != 'X') {
                    sumScore += count++;
                } else {
                    count = 1;
                }

            }
            bw.write(sumScore + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

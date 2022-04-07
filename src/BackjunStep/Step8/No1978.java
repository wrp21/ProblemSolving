package BackjunStep.Step8;
import java.io.*;
import java.util.StringTokenizer;

public class No1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int number, count = 0;
        for(int i = 1; i <= N; i++) {
            number = Integer.parseInt(st.nextToken());
            boolean isPrime = true;
            for(int j = 2; j <= (number / 2) + 1; j++) {
                if(number != j && number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && number != 1) {
                count++;
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}

package BackjunStep.Step4;
import java.io.*;


public class No2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < 9; i++) {
            int number = Integer.parseInt(br.readLine());
            if(max < number) {
                max = number;
                maxIndex = i + 1;
            }
        }
        bw.write( max + "\n" + maxIndex + "\n");
        bw.flush();
        bw.close();

    }
}

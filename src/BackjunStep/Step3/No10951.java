package BackjunStep.Step3;
import java.io.*;
import java.util.StringTokenizer;

public class No10951 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String testCase = "";
        while(true) {
            testCase = br.readLine();
            if(testCase == null) {
                break;
            }
            st = new StringTokenizer(testCase, " ");
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        bw.flush();
        bw.close();

    }
}

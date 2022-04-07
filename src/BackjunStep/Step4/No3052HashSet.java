package BackjunStep.Step4;
import java.io.*;
import java.util.HashSet;

public class No3052HashSet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < 10; i++) {
            set.add(Integer.parseInt(br.readLine()) % 42);
        }

        bw.write(set.size() + "\n");
        br.close();
        bw.flush();
        bw.close();

    }
}

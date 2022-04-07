package BackjunStep.Step4;
import java.io.*;

public class No2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numberArray = new int[10];

        int multiply = 1;

        for(int i = 0; i < 3; i++ ) {
            multiply *= Integer.parseInt(br.readLine());
        }
        String strMultiply = String.valueOf(multiply);
        int index = 0;
        for(int i = 0; i < strMultiply.length(); i++) {
            index = Integer.parseInt(strMultiply.substring(i, i+1));
            numberArray[index] += 1;
        }

        for (int j : numberArray) {
            bw.write(j + "\n");
        }
        bw.flush();
        bw.close();

    }
}

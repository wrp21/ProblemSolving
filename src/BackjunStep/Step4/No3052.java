package BackjunStep.Step4;
import java.io.*;

public class No3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numArray = new int[10];
        int[] setArray = new int[10];
        int count = 0;
        int sameCount = 0;

        for(int i = 0; i < numArray.length; i++) {
            numArray[i] = Integer.parseInt(br.readLine()) % 42;
            setArray[i] = -1;
        }

        for (int temp : numArray) {
            boolean isSame = false;

            for (int i : setArray) {
                if (temp == i) {
                    isSame = true;
                    break;
                }

            }
            if (!isSame) {
                setArray[count++] = temp;
            }

        }


        for(int i = 0; i < setArray.length; i++) {
            if(setArray[i] != -1) {
                sameCount = i + 1;
            } else {
                break;
            }
        }

        bw.write(sameCount + "\n");
        bw.flush();
        bw.close();

    }
}

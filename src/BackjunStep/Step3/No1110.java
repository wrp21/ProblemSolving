package BackjunStep.Step3;

import java.io.*;

public class No1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String compareNumber = br.readLine();
        br.close();
        int count = 0;
        if(Integer.parseInt(compareNumber) < 10) {
            compareNumber = "0" + compareNumber;
        }
        String firstNumber = compareNumber;
        String sum;

        while(true) {

            // 1. 십의 자리 수와 1의 자리 수를 더한 값 sum
            int tempSum = Integer.parseInt(compareNumber.substring(0, 1)) + Integer.parseInt(compareNumber.substring(1, 2));
            if (tempSum >= 10) {
                sum = String.valueOf(tempSum);
            } else {
                sum = "0" + tempSum;
            }
            // 2. 기존의 수 number의 1의 자리와 sum의 1의 자리를 문자열 계산하면 새로운 수가 나온다.
            String newNumber = compareNumber.substring(1, 2) + sum.substring(1, 2);

            // 3. 기존의 값과 새로운 수가 같지 않으면 사이클 길이가 추가된다.
            if(firstNumber.equals(newNumber)) {
                count++;
                break;
            } else {
                count++;
                compareNumber = newNumber;

            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}

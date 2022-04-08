package BackjunStep.Step17;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class No9012 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < T; i++) {
            st = new StringTokenizer(br.readLine(), "");
            Stack<Character> stack = new Stack<>();
            String token = st.nextToken();
            for(int j = 0; j < token.length(); j++) {
                char tokenEle = token.charAt(j);
                if(stack.isEmpty()) {
                    stack.push(tokenEle);
                } else if(stack.peek() == '(' && tokenEle == ')') {
                    stack.pop();
                } else {
                    stack.push(tokenEle);
                }
            }
            if(stack.isEmpty()) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();

    }
}

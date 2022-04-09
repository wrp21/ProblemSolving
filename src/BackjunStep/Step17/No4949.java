package BackjunStep.Step17;
import java.io.*;
import java.util.Stack;


public class No4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String line = br.readLine();

            if(line.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();

            for(int i = 0; i < line.length(); i++) {
                char element = line.charAt(i);
                if(element == '(' || element == '[') {
                    stack.push(element);
                } else if(!stack.empty() && stack.peek() == '(' && element == ')') {
                    stack.pop();
                } else if(!stack.empty() && stack.peek() == '[' && element == ']') {
                    stack.pop();
                } else if(element == ')' || element == ']') {
                    stack.push(element);
                }
            }

            if(stack.empty()) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }

}

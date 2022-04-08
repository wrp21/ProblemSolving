package etc.Problem10;
import java.util.HashMap;
import java.util.Locale;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Character, Integer> map = new HashMap<>();
        int totalCount = 0;

        FileUtils fileUtil = new FileUtils();
        String text = fileUtil.getLoadText(
                "F:\\Backend\\Repository\\ProblemSolving\\src\\etc\\Problem10\\text").toUpperCase(Locale.ROOT);

        for(int i = 0; i < text.length(); i++) {
            char textEle = text.charAt(i);
//            if((textEle >= 'A') && (textEle <= 'Z')) {
                totalCount++;
//            }

            if(map.containsKey(textEle)) {
                map.put(textEle, map.get(textEle) + 1);
            } else {
                map.put(textEle, 1);
            }
        }

        for(char i = 'A'; i <= 'Z'; i++) {
            int eleCount = map.get(i);
            bw.write(String.format("%c = \t %3d개,\t\t%.2f%%\n", i, eleCount, eleCount / (double)totalCount * 100 ));
        }
        System.out.println(totalCount);
        bw.flush();
        bw.close();



    }
}

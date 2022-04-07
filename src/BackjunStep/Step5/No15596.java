package BackjunStep.Step5;

public class No15596 {

    public static long sum(int[] a) {

        long ans = 0;
        for (int j : a) {
            ans += j;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[] {1, 2, 3, 4, 5}));
    }
}

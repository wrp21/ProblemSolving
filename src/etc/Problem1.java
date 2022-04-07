package etc;

/*
    과제 1.
    "콘솔 화면에 구구단 출력하기"
    다중 반복문, String.format 메서드를 이용하여 주어진 콘솔화면의 형식에 맞게 1 ~ 9단 표시
 */
//import java.util.stream.IntStream;
public class Problem1 {
    public static void main(String[] args) {

        System.out.println("[구구단 출력]");

        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.print(String.format("%02d x %02d = %02d\t", j, i, j*i));
            }
            System.out.printf("\n");
        }


//        IntStream.rangeClosed(1, 9).forEach(i -> {
//            IntStream.rangeClosed(1, 9).forEach(j -> {
//                System.out.print(String.format("%02d * %02d = %02d",i, j, i * j));
//                System.out.print("\t");
//            });
//            System.out.println();
//        });
    }
}





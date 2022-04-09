package Backjun;
import java.util.Scanner;

public class No1449 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputFirstLine = input.nextLine().split(" ");
        String[] inputSecondLine = input.nextLine().split(" ");

        // 첫번째 줄 입력에서  N과 L 분리
        int N = Integer.parseInt(inputFirstLine[0]);
        int L = Integer.parseInt(inputFirstLine[1]);

        // 두번째 줄 입력에서 새는 곳 위치를 int로 변환
        int[] dropPositionArray = new int[N];
        for(int i = 0; i < N; i++) {
            dropPositionArray[i] = Integer.parseInt(inputSecondLine[i]);
        }

        // 테이프 개수 : 최소 1개 입력 조건상 최소 한개 이상
        int tapeNumber = 1;

        // 위치 정렬
        for(int j = 0; j < dropPositionArray.length; j++) {
            for(int k = 1; k < dropPositionArray.length; k++) {
                if(dropPositionArray[k-1] > dropPositionArray[k]) {
                    int temp = dropPositionArray[k-1];
                    dropPositionArray[k-1] = dropPositionArray[k];
                    dropPositionArray[k] = temp;

                }
            }
        }

        int prevPosition = dropPositionArray[0];
        for(int i = 1; i < dropPositionArray.length; i++) {
            // 다음 위치와의 거리가 테이프 길이보다 크면
            if(dropPositionArray[i] - prevPosition >= L) {
                tapeNumber++;
                // 이전 위치 저장
                prevPosition = dropPositionArray[i];
            }
        }

        System.out.println(tapeNumber);
    }
}

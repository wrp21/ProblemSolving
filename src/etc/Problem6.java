package etc;/*
    과제 6.
    "가상 대선 당선 피뮬레이션 프로그램"

    1. 기호 1번 이재명, 기호 2번 운석열, 기호 3번 심상정, 기호 4번 안철수 순으로 진행
    2. 총 투표수 10000건 진행
    3. 각 투표수의 결과는 4명의 대선주자들이 동일한 비율로 랜덤하게 발생(단, 당선자는 동율이 안됨)
    4. 임의 번호는 Random 함수의 nextInt()함수를 통해서 생성
 */

import java.util.Random;

class CandidateInfo {

    final static int totalVoteNumber = 10000;

    private String name = "";
    private double percent = 0D;
    private int voteNumber = 0;
    private int flag = 0;

    public CandidateInfo(String name, int flag) {
        setName(name);
        this.flag = flag;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setVoteNumber(int voteNumber) {
        this.voteNumber = voteNumber;
    }

    public int getVoteNumber() {
        return this.voteNumber;
    }

    public int getFlag() {
        return this.flag;
    }

    public String count() {
        this.voteNumber++;
        this.percent = (this.voteNumber / (double)CandidateInfo.totalVoteNumber ) * 100;
        return this.name;
    }
}

public class Problem6 {

    public static void main(String[] args) {

        CandidateInfo[] candidates =
                {
                        new CandidateInfo("이재명", 1),
                        new CandidateInfo("윤석열", 2),
                        new CandidateInfo("심상정", 3),
                        new CandidateInfo("안철수", 4)
                };

        Random randomCandidateSelector = new Random();
        double totalVotePercent = 0D;

        for(int voteIndex = 1; voteIndex <= CandidateInfo.totalVoteNumber; voteIndex++) {
            totalVotePercent = (voteIndex / (double)CandidateInfo.totalVoteNumber ) * 100;
            String candidateName = candidates[randomCandidateSelector.nextInt(4)].count();
            System.out.printf("[투표진행율]: %.2f%%, %d명 투표 => %s\n",
                    totalVotePercent,  voteIndex, candidateName);

            for(CandidateInfo candidate: candidates) {
                System.out.printf("[기호:%d] %s: %.2f%%, (투표수: %d)\n",
                        candidate.getFlag(), candidate.getName(), candidate.getPercent(), candidate.getVoteNumber());
            }

            if(voteIndex != CandidateInfo.totalVoteNumber) {
                System.out.println();
            }
        }

        CandidateInfo maxCandidate = candidates[0];
        for (CandidateInfo candidate : candidates) {
            if (maxCandidate.getVoteNumber() < candidate.getVoteNumber()) {
                maxCandidate = candidate;
            }
        }

        System.out.println("[투표결과] 당선인: " +  maxCandidate.getName());

    }
}

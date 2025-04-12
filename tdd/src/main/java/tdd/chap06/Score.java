package tdd.chap06;

import java.util.List;

public class Score {
    private int strikes;
    private int balls;

    public Score(List<Integer> ansNums, List<Integer> inputNums) {
        for (int i = 0; i < inputNums.size(); i++) {
            Integer inputNum = inputNums.get(i);
            if (!ansNums.contains(inputNum)) continue;

            if (ansNums.get(i) == inputNums.get(i)) {
                strikes++;
            } else {
                balls++;
            }
        }
    }

    public int balls() {
        return balls;
    }

    public int strikes() {
        return strikes;
    }
}

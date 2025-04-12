package tdd.chap06;

import java.util.*;
import java.util.stream.Collectors;

public class BaseballGame {
    private final List<Integer> ansNums;

    public BaseballGame(String answer) {
        List<Integer> eachNums = getEachNums(answer);
        validate(eachNums);
        this.ansNums = eachNums;
    }

    private static void validate(List<Integer> eachNums) {
        Set<Integer> uniqueNums = new HashSet<>(eachNums);
        if (uniqueNums.size() != eachNums.size()) {
            throw new IllegalArgumentException("중복된 숫자가 존재합니다: " + eachNums);
        }
    }

    public Score guess(String input) {
        return new Score(ansNums, getEachNums(input));
    }

//    private List<Integer> getEachNums(String input) {
//        List<Integer> nums = new ArrayList<>();
//        Arrays.stream(input.split(""))
//                .forEach(split->nums.add(Integer.parseInt(split)));
//        return nums;
//    }

    private static List<Integer> getEachNums(String input) {
        return input.chars()
                .mapToObj(c -> c - '0')
                .collect(Collectors.toList());
    }
}

package com.company.Avid;

        import java.util.stream.IntStream;

public class Solution {

    private int count = 0;

    public int solution(int N) {
        int[] range = IntStream.rangeClosed(1, N).toArray();
        for (int k = 0; k < range.length; k++) {
            String number = String.valueOf(range[ k ]);
            for (int i = 0; i < number.length(); i++) {
                int j = Character.digit(number.charAt(i), 10);
                if (j == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.solution(155));
    }
}
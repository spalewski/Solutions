package com.company.Avid;

public class Solution2 {

    public int solution(int A, int B) {
/*        int p = 0;
        int[] range = IntStream.rangeClosed(A, B).toArray();
        for (int i = 0; i < range.length; i++) {
            double sqrt = Math.sqrt(range[ i ]);
            int x = (int) sqrt;
            if (Math.pow(sqrt, 2) == Math.pow(x, 2)) {
                p++;
            }
        }
        return p;
    }
}*/
        int count = 0;
        int square = -1;
        int start;
        if (A == 0) {
            start = 1;
        } else {
            start = A;
        }

        for (int i = start; square <= B; i++) {
            square = i * i;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution(20, 22245));
    }
}

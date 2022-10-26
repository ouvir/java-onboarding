package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int p_1 = pobi.get(0);
        int p_2 = pobi.get(1);
        int c_1 = crong.get(0);
        int c_2 = crong.get(1);
        // proxy-> check exception
        if (p1_proxy(p_1, p_2) || p1_proxy(c_1, c_2)) {
            return -1;
        }
        int answer = Integer.MAX_VALUE;
        return answer;
    }
    private static boolean p1_proxy(int a0, int a1) {
        // Check start page or last page
        if (a0 == 1 || a1 == 400) {
            return true;
        }
        // Check linked page a0, a1
        if (a0 + 1 != a1) {
            return true;
        }
        return false;
    }

    private static int digit_sum(int N) {
        int output = 0;
        while (N / 10 != 0) {
            output += N % 10;
            N /= 10;
        }
        output += N; // last digit
        return output;
    }
    private static int digit_prod(int N) {
        int output = 1;
        while (N / 10 != 0) {
            output *= N % 10;
            N /= 10;
        }
        output *= N; // last digit
        return output;
    }
}
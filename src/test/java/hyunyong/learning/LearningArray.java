package hyunyong.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LearningArray {

    @Test
    void testSumOfOdd() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int result = sumOfAdd(nums);

        Assertions.assertEquals(result, 1 + 3 + 5 + 7 + 9);
    }

    private int sumOfAdd(int[] nums) {
        // 홀수의 합을 리턴한다.
        return 0;
    }

    @Test
    void testDivisor() {
        int[] nums = {5, 9, 7, 10};
        int divisor = 5;

        int count = getCountOfDividingNumber(nums, divisor);

        Assertions.assertEquals(count, 2);
    }

    private int getCountOfDividingNumber(int[] nums, int divisor) {
        // divisor로 나누어 떨어지는 수의 개수를 리턴하세요.
        // 예를 들어 5, 9, 7, 10에서 5로 나누어 떨어지는 수는 5와 10 이므로 2를 리턴
        return 0;
    }
}

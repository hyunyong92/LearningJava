package hyunyong.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrimeTest {

    @Test
    void testPrime() {
        Assertions.assertFalse(isPrime(1));
        Assertions.assertTrue(isPrime(2));
        Assertions.assertTrue(isPrime(3));
        Assertions.assertFalse(isPrime(4));
        Assertions.assertTrue(isPrime(5));
        Assertions.assertFalse(isPrime(6));
        Assertions.assertTrue(isPrime(7));
        Assertions.assertFalse(isPrime(8));
        Assertions.assertFalse(isPrime(9));
    }

    @Test
    void testCountPrime() {
        Assertions.assertEquals(countPrime(10), 4);
    }

    private int countPrime(int input) {
        // input 보다 작은수중에 소수의 개수를 구해라
        // 예를 들어 input이 10이면 10보다 작은 소수는 2, 3, 5, 7 이므로 4를 리턴
        int count = 0;
        boolean isprime;
        for (int i = 2; i <= input; i++) {
            isprime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
                if (isprime == true) {
                    count++;
                }
            }
        return count;
    }
    private boolean isPrime(int num) {
        // 소수인 경우 true를 리턴
        // 소수가 아닌 경우 false를 리턴
        // Hint : 소수란 "1보다 크고 1과 자기자신으로만 나누어지는 수"를 말한다.
        boolean isPrime = true;
        if(num == 1)
            isPrime = false;
        for(int i = 2; i < num; i++) {

            if(num % i == 0)
                isPrime = false;

        }

        return isPrime;
    }
}
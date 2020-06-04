package hyunyong.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeTest {

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

    private boolean isPrime(int num) {
        // 소수인 경우 true를 리턴
        // 소수가 아닌 경우 false를 리턴
        // Hint : 소수란 "1보다 크고 1과 자기자신으로만 나누어지는 수"를 말한다.
        return false;
    }
}

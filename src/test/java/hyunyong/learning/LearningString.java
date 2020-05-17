package hyunyong.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LearningString {

    @Test
    void testEquals() {
        String a = "hello";
        String b = "hello";
        String c = "world";

        Assertions.assertTrue(compareString(a, b));
        Assertions.assertFalse(compareString(a, c));
    }

    private boolean compareString(String str1, String str2) {
        // str1, str2가 같으면 true
        // str1, str2가 다르면 false
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}

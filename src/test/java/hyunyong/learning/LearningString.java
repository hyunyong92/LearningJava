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

    @Test
    void testCompletion() {
        String[] participant = new String[] {"gunju", "hyunyong", "0hun"};
        String[] completion = new String[] {"gunju", "hyunyong"};

        String failRunner = checkCompletion(participant, completion);

        Assertions.assertEquals(failRunner, "0hun");
    }

    private String checkCompletion(String[] participant, String[] completion) {
        for (int i = 0; i < participant.length; i++) {
            boolean success = false;
            for (int j = 0; j < completion.length; j++) {
                if (participant[i].equals(completion[j])) {
                    success = true;
                    break;
                }
            }
            if (!success) {
                return participant[i];
            }
        }
        return null;
    }
}

package hyunyong.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    @Test
    void testSet() {
        Set<String> strings = new HashSet<>();
        strings.add("gunju");
        strings.add("hyunyong");
        strings.add("0hun");
        strings.add("0hun");

        Assertions.assertEquals(strings.size(),3);

        for (String i : strings) {
            System.out.println(i);
        }
    }
}

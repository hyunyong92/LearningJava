package hyunyong.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    @Test
    void testList() {
        List<String> strings = new ArrayList<>();

        strings.add("gunju");
        strings.add("hyunyong");

        for (String string : strings) {
            System.out.println(string);
        }

        Assertions.assertEquals(strings.get(0), "gunju");
        Assertions.assertEquals(strings.get(1), "hyunyong");
        strings.remove(0);
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    void testFindIndex() {
        List<String> strings = new ArrayList<>();
        strings.add("gunju");
        strings.add("hyunyoung");
        strings.add("younghun");

        Assertions.assertEquals(findIndex(strings, "gunju"), 0);
        Assertions.assertEquals(findIndex(strings, "hyunyoung"), 1);
        Assertions.assertEquals(findIndex(strings, "younghun"), 2);
        Assertions.assertEquals(findIndex(strings, "sujung"), -1);
    }

    private int findIndex(List<String> strings, String str) {
        for (int i = 0; i < strings.size(); i++) {
            if (str.equals(strings.get(i)))
                return i;
        }
        return -1;
    }

    @Test
    void testCopy() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        List<Integer> copy = copy(integers);

        Assertions.assertEquals(copy.size(), 3);
    }

    private List<Integer> copy(List<Integer> list) {
        return new ArrayList<>(list);
    }
}

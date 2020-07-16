package hyunyong.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnimalTest {

    @Test
    void testName() {
        Animal monkey = new Monkey();
        Assertions.assertEquals(monkey.name(), "Monkey");
    }

    public static class Monkey extends Animal {
        @Override
        String name() {
            return null;
        }
    }
}

package hyunyong.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnimalTest {

    @Test
    void testName() {
        Animal monkey = new Monkey();
        Assertions.assertEquals(monkey.name(), "Monkey");
        Assertions.assertEquals(monkey.footCount(),2);
        Animal cat = new Cat();
        Assertions.assertEquals(cat.name(),"Cat");
        Assertions.assertEquals(cat.footCount(),4);
    }

    public static class Cat extends Animal {
        String name() {
            return "Cat";
        }
        int footCount(){
            return 4;
        }
    }

    public static class Monkey extends Animal {
        @Override
        String name() {
            return "Monkey";
        }
        int footCount(){
            return 2;
        }
    }
}

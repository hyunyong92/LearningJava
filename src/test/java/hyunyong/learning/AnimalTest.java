package hyunyong.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnimalTest {

    @Test
    void testName() {
        Animal animal = new Monkey();
        Assertions.assertEquals(animal.name(), "Monkey");
        Assertions.assertEquals(animal.footCount(),2);
        animal = new Cat();
        Assertions.assertEquals(animal.name(),"Cat");
        Assertions.assertEquals(animal.footCount(),4);
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

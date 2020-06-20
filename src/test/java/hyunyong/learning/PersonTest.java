package hyunyong.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testClass() {
        Person hyunyong = new Person("hyunyong", 29);
        Person gunju = new Person("gunju", 28);

        Assertions.assertEquals("hyunyong", hyunyong.getName());
        Assertions.assertEquals("gunju", gunju.getName());
        Assertions.assertEquals(29, hyunyong.getAge());
        Assertions.assertEquals(28, gunju.getAge());
        gunju.getOlder();
        Assertions.assertEquals(29, gunju.getAge());
    }
}

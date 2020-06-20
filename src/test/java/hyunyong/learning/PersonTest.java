package hyunyong.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testClass() {
        // hyunyong age 29
        Person hyunyong = new Person();
        hyunyong.setName("hyunyong");
        hyunyong.setAge(29);

        // gunju age 28
        Person gunju = new Person();
        gunju.setName("gunju");
        gunju.setAge(28);
        Assertions.assertEquals("hyunyong", hyunyong.getName());
        Assertions.assertEquals("gunju", gunju.getName());
        Assertions.assertEquals(29, hyunyong.getAge());
        Assertions.assertEquals(28, gunju.getAge());
    }
}

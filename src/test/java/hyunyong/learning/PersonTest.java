package hyunyong.learning;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void testClass() {
        Person hyunyong = new Person();
        hyunyong.setName("hyunyong");

        Person gunju = new Person();
        gunju.setName("gunju");
    }
}

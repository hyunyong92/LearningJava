package hyunyong.learning;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    void testHello() {
        HelloWorld world = new HelloWorld();
        String hello = world.hello();
        Assertions.assertEquals("Hello World", hello);
    }

}

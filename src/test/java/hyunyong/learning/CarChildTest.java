package hyunyong.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarChildTest {
    @Test
    void name() {
        CarChild carchild = new CarChild(5,3);

        Assertions.assertTrue(carchild.isLeftGas());
        carchild.go();
        Assertions.assertEquals(carchild.getLeftGas(), 4);
        Assertions.assertEquals(carchild.getDistance(), 3);
    }
}

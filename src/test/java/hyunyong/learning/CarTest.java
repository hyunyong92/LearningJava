package hyunyong.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void testRun() {
        Car car = new Car(10, 2);

        Assertions.assertTrue(car.isLeftGas());
        car.go();
        Assertions.assertEquals(car.getLeftGas(), 9);
        Assertions.assertEquals(car.getDistance(), 2);
    }
}

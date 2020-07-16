package hyunyong.learning;

public class Car {

    private int gas;
    private int power;
    private int distance;

    public Car(int gas, int power) {
        this.gas = gas;
        this.power = power;
    }

    public boolean isLeftGas() {
        return gas != 0;
    }

    public void go() {
        if (isLeftGas()) {
            distance = distance + power;
            gas = gas - 1;
        }
    }

    public int getLeftGas() {
        return gas;
    }

    public int getDistance() {
        return distance;
    }
}

package hyunyong.learning;

public class Car {
    private int gas;
    private int power;
    private int distance;

    public Car(int gas, int power) {
        // gas, power 초기화
        this.gas = gas;
        this.power = power;
    }

    public boolean isLeftGas() {
        // TODO : gas가 남아있으면 true, gas가 없으면 false
        if(gas != 0) {
            return true;
        }
        return false;
    }

    public void go() {
        // TODO : gas를 1 소비해서 gas * power만큼 앞으로 간다. 앞으로 간만큼 distance가 증가
     if(gas != 0) {
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

    public void run() {

    }
}

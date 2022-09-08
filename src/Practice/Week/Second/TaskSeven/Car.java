package Practice.Week.Second.TaskSeven;

public class Car extends Transport {
    int maxPassengers;

    public Car(int fuel, int speed, int maxPassengers) {
        super(fuel, speed);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public boolean canMove(int n) {
        if (fuel >= n) {
            fuel = fuel - n;
            return true;
        } else return false;
    }

    @Override
    public int getFuelLevel() {
        return fuel;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}

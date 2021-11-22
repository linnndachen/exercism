class NeedForSpeed {
    private final int speed;
    private final int batteryDrain;
    private int totalDistanceDriven = 0;
    private int batteryLeft = 100;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryLeft < batteryDrain;
    }

    public int distanceDriven() {
        return totalDistanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            totalDistanceDriven += speed;
            batteryLeft -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed nitroCar = new NeedForSpeed(50, 4);
        return nitroCar;
    }
}

class RaceTrack {
    private final int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }
    public boolean carCanFinish(NeedForSpeed car) {
        return (100/car.getBatteryDrain() * car.getSpeed()) >= distance;
    }
}

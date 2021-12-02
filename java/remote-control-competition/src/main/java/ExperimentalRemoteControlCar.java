public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private final static int DISTANCE_INCREMENT = 20;
    private int distanceTravelled = 0;

    public void drive() {
        distanceTravelled += DISTANCE_INCREMENT;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }
}

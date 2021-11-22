public class ElonsToyCar {
    private static final int DISTANCE_INCREMENT = 20;
    private static final int BATTERY_DECREMENT = 1;
    private int totalDistance = 0;
    private int batteryLeft = 100;

    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + totalDistance + " meters";
    }

    public String batteryDisplay() {
        return batteryLeft > 0 ? "Battery at " + batteryLeft + "%" : "Battery empty";
    }

    public void drive() {
        if (batteryLeft > 0) {
            totalDistance += DISTANCE_INCREMENT;
            batteryLeft -= BATTERY_DECREMENT;
        }
    }
}

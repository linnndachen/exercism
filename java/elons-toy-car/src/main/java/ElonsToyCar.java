public class ElonsToyCar {
    private static final int DISTANCE_INCREMENT = 20;
    private static final int BATTERY_DECREMENT = 1;
    private int totalDistance = 0;
    private int batteryLeft = 100;

    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
        // throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.buy()  method");
    }

    public String distanceDisplay() {
        return "Driven " + totalDistance + " meters";
        // throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.distanceDisplay()  method");
    }

    public String batteryDisplay() {
        return batteryLeft > 0 ? "Battery at " + batteryLeft + "%" : "Battery empty";
        // throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.batteryDisplay()  method");
    }

    public void drive() {
        if (batteryLeft > 0) {
            totalDistance += DISTANCE_INCREMENT;
            batteryLeft -= BATTERY_DECREMENT;
        }
        // throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.drive()  method");
    }
}

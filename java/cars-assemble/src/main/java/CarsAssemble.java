import java.lang.Math;

public class CarsAssemble {

    public double totalProduction(int speed) {
        if (speed <= 4) {
            return speed * 221;
        } else if (speed <= 8) {
            return speed * 221 * 0.9;
        } else if (speed == 9) {
            return speed * 221 * 0.8;
        } else {
            return speed * 221 * 0.77;
        }
    }

    public double productionRatePerHour(int speed) {
        return totalProduction(speed);

        // throw new UnsupportedOperationException("Please implement the AssemblyLine.productionRateperHour() method");
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (totalProduction(speed)/60.0);
        // throw new UnsupportedOperationException("Please implement the AssemblyLine.workingItemsPerMinute() method");
    }

    /*
    public static void main(String[] args) {
        CarsAssemble car = new CarsAssemble();
        System.out.println(car.workingItemsPerMinute(10));
        System.out.println(car.productionRatePerHour(10));

    }
     */
}

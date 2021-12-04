import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> rankings = Arrays.asList(prc1, prc2);
        Collections.sort(rankings);

        return rankings;
    }
}

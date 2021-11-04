public class Lasagna {
    int totalMinutes = 40;

    // TODO: define the 'expectedMinutesInOven()' method

    public int expectedMinutesInOven() {

        return totalMinutes;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int usedMinutes) {
        return totalMinutes - usedMinutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int usedMinutes) {

        return preparationTimeInMinutes(layers) + remainingMinutesInOven(usedMinutes);
    }
}

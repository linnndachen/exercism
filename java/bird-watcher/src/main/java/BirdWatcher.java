import java.util.stream.IntStream;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        // throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");

        return IntStream.range(0, birdsPerDay.length)
                        .map(i -> birdsPerDay[i])
                        .toArray();
    }

    public int getToday() {
        // throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
        return birdsPerDay.length > 0 ? birdsPerDay[birdsPerDay.length - 1] : 0;
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
        // throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
    }

    public boolean hasDayWithoutBirds() {
        for (int d : birdsPerDay) {
            if (d == 0) {
                return true;
            }
        }

        return false;
        // throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
    }

    public int getCountForFirstDays(int numberOfDays) {
        int counts = 0;

        for (int d : birdsPerDay) {
            if (numberOfDays <= 0) {
                break;
            } else {
                numberOfDays -= 1;
                counts += d;
            }
        }
        return counts;
        // throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        int busyDays = 0;

        for (int d : birdsPerDay){
            if (d >= 5){
                busyDays++;
            }
        }

        return busyDays;
        // throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
    }
}

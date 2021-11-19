import java.util.Arrays;
import java.util.stream.Collectors;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {

        return birdsPerDay.clone();
    }

    public int getToday() {
        return birdsPerDay.length > 0 ? birdsPerDay[birdsPerDay.length - 1] : 0;
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).anyMatch(day -> day == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {

        return Arrays.stream(birdsPerDay).limit(numberOfDays).sum();
        // return Arrays.stream(birdsPerDay).limit(numberOfDays).collect(Collectors.summingInt(Integer::intValue));
        /*
        error: incompatible types: cannot infer type-variable(s) R
                            .collect(Collectors.summingInt(Integer::intValue));
                                    ^
        (argument mismatch; no instance(s) of type variable(s)
        CAP#1,T exist so that Collector<T,?,Integer> conforms to Supplier<R>)
        where R,T are type-variables:
        R extends Object declared in method <R>collect(Supplier<R>,ObjIntConsumer<R>,BiConsumer<R,R>)
        T extends Object declared in method <T>summingInt(ToIntFunction<? super T>)
        where CAP#1 is a fresh type-variable:
        CAP#1 extends Object from capture of ?

         */
    }

    public int getBusyDays() {
        return (int) Arrays.stream(birdsPerDay).filter(day -> day >= 5).count();
    }
}

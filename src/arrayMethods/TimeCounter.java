package arrayMethods;

/**
 * Created by Andriy on 30.11.2015.
 */
public class TimeCounter {

    public static long countActionTime(TimeAction timeAction){
        long start = System.currentTimeMillis();
        timeAction.callwrappedAction();
        long stop = System.currentTimeMillis();

        return stop - start;

    }
}

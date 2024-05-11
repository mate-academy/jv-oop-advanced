package core.basesyntax.utility;

public class Utility {
    public static double roundAfterPoint(double number, int position) {
        int coefficient = (int) Math.pow(10, position);
        return (double) ((long) (number * coefficient)) / coefficient;
    }
}

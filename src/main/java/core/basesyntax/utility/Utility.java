package core.basesyntax.utility;

public class Utility {
    public static double roundAfterPoint(double number, int position) {
        int koeficient = (int) Math.pow(10, position);
        return (double) ((long) (number * koeficient)) / koeficient;
    }
}

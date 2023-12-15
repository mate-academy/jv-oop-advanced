package core.basesyntax.utils;

public class NumberRounder {
    public static double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}

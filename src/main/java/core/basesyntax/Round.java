package core.basesyntax;

public class Round {
    public static double toRound(double value) {
        int scale = (int) Math.pow(10, 1);
        return (double) Math.round(value * scale) / scale;
    }
}

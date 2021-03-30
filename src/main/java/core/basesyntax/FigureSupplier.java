package core.basesyntax;

public class FigureSupplier {
    public static double getRandomProperties() {
        double max = 1.0;
        double min = 15.0;
        return (int) ((Math.random() * (max - min)) + min);
    }
}

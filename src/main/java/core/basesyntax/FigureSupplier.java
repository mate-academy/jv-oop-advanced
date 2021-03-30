package core.basesyntax;

public class FigureSupplier {
    public static double lengthGen() {
        return Math.random() * 100 + 1;
    }

    public static double lengthGen(double value1, double value2) {
        return Math.random() * (2 * value2 + 1) + value1;
    }
}

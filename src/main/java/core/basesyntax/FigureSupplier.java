package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int MAX_VALUE = 10;

    public Figure getRandomFigure() {
        int randomValue = new Random().nextInt(FIGURES_COUNT);
        switch (randomValue) {
            case 0:
                return new Square(getRandomDouble(), ColorSupplier.getRandomColor());
            case 1:
                return new Circle(getRandomDouble(), ColorSupplier.getRandomColor());
            case 2:
                return new Rectangle(getRandomDouble(), getRandomDouble(),
                        ColorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(getRandomDouble(), getRandomDouble(),
                        ColorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(getRandomDouble(), getRandomDouble(),
                        getRandomDouble(), ColorSupplier.getRandomColor());
        }
    }

    private double getRandomDouble() {
        return new Random().nextDouble() * MAX_VALUE;
    }
}

package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int MAX_VALUE = 10;

    public Figure getRandomFigure() {
        int randomValue = new Random().nextInt(FIGURES_COUNT);
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (randomValue) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), getRandomDouble());
            case 1:
                return new Circle(colorSupplier.getRandomColor(), getRandomDouble());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomDouble(),
                        getRandomDouble());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomDouble(),
                        getRandomDouble());
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomDouble(),
                        getRandomDouble(), getRandomDouble());
        }
    }

    private double getRandomDouble() {
        return new Random().nextDouble() * MAX_VALUE;
    }
}

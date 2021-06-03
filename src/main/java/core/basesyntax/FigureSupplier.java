package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURES_SIZE = 10;
    private static final int NUMBER_OF_FIGURES = 5;

    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public static Figure getRandomFigure() {
        switch (new Random().nextInt(NUMBER_OF_FIGURES)) {
            case 1:
                return new Circle(ColorSupplier.getRandomColor(), getRandomDouble());
            case 2:
                return new Rectangle(ColorSupplier.getRandomColor(), getRandomDouble(),
                            getRandomDouble());
            case 3:
                return new RightTriangle(ColorSupplier.getRandomColor(), getRandomDouble(),
                            getRandomDouble());
            case 4:
                return new Square(ColorSupplier.getRandomColor(), getRandomDouble());
            default:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(), getRandomDouble(),
                            getRandomDouble(), getRandomDouble());
        }
    }

    private static double getRandomDouble() {
        return new Random().nextInt(MAX_FIGURES_SIZE) * 1.00;
    }
}

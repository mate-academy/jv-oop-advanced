package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int MAX_FIGURES_SIZE = 10;
    private static final int NUMBER_OF_FIGURES = 5;

    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        switch (new Random().nextInt(NUMBER_OF_FIGURES)) {
            case 1:
                return new Circle(getRandomColor(), getRandomDouble());
            case 2:
                return new Rectangle(getRandomColor(), getRandomDouble(),
                            getRandomDouble());
            case 3:
                return new RightTriangle(getRandomColor(), getRandomDouble(),
                            getRandomDouble());
            case 4:
                return new Square(getRandomColor(), getRandomDouble());
            default:
                return new IsoscelesTrapezoid(getRandomColor(), getRandomDouble(),
                            getRandomDouble(), getRandomDouble());
        }
    }

    private double getRandomDouble() {
        return new Random().nextInt(MAX_FIGURES_SIZE);
    }
}

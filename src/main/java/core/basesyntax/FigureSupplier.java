package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURES_SIZE = 10;
    private static final int NUMBER_OF_FIGURES = 5;

    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (new Random().nextInt(NUMBER_OF_FIGURES)) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), getRandomDouble());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomDouble(),
                            getRandomDouble());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomDouble(),
                            getRandomDouble());
            case 4:
                return new Square(colorSupplier.getRandomColor(), getRandomDouble());
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomDouble(),
                            getRandomDouble(), getRandomDouble());
        }
    }

    private double getRandomDouble() {
        return new Random().nextInt(MAX_FIGURES_SIZE);
    }
}

package core.basesyntax;

import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int FIGURES_COUNT = 5;
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        final int maxValue = 10;
        final int randomSize = random.nextInt(maxValue) + 1;

        switch (random.nextInt(FIGURES_COUNT)) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), randomSize);
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomSize, randomSize, randomSize);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        randomSize, randomSize);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        randomSize, randomSize);
            default:
                return new Square(colorSupplier.getRandomColor(), randomSize);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), 10);
    }
}

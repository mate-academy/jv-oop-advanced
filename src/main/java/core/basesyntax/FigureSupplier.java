package core.basesyntax;

import java.util.concurrent.ThreadLocalRandom;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public FigureSupplier() {
    }

    public Figure getRandomFigure() {
        int figureType = ThreadLocalRandom.current().nextInt(FIGURE_TYPES_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                double radius = getRandomDimension();
                return new Circle(color, radius);
            case 1:
                double side = getRandomDimension();
                return new Square(color, side);
            case 2:
                double width = getRandomDimension();
                double height = getRandomDimension();
                return new Rectangle(color, width, height);
            case 3:
                double firstLeg = getRandomDimension();
                double secondLeg = getRandomDimension();
                return new RightTriangle(color, firstLeg, secondLeg);
            case 4:
                double base1 = getRandomDimension();
                double base2 = getRandomDimension();
                double leg = ThreadLocalRandom.current().nextDouble(
                        Math.abs(base2 - base1) / 2 + 0.01, 100);
                return new IsoscelesTrapezoid(color, base1, base2, leg);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private double getRandomDimension() {
        return ThreadLocalRandom.current().nextDouble(1, 100);
    }
}


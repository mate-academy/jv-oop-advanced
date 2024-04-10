package core.basesyntax.suppliers;

import core.basesyntax.Color;
import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_GEOMETRIC_PROPERTY = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_COUNT = 4;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int value = random.nextInt(FIGURE_COUNT);
        return switch (value) {
            case 0 -> new Circle(randomDouble(1, MAX_GEOMETRIC_PROPERTY),
                    colorSupplier.getRandomColor());
            case 1 -> new IsoscelesTrapezoid(randomDouble(6, MAX_GEOMETRIC_PROPERTY),
                    randomDouble(7, MAX_GEOMETRIC_PROPERTY),
                    randomDouble(3, 6), colorSupplier.getRandomColor());
            case 2 -> {
                double sideA = randomDouble(5, MAX_GEOMETRIC_PROPERTY);
                double sideB = randomDouble(5, MAX_GEOMETRIC_PROPERTY);
                while (sideA == sideB) {
                    sideA = randomDouble(5, MAX_GEOMETRIC_PROPERTY);
                }
                yield new Rectangle(sideA, sideB, colorSupplier.getRandomColor());
            }
            case 3 -> new RightTriangle(randomDouble(1, MAX_GEOMETRIC_PROPERTY),
                    randomDouble(1, MAX_GEOMETRIC_PROPERTY),
                    colorSupplier.getRandomColor());
            case 4 -> new Square(randomDouble(1, MAX_GEOMETRIC_PROPERTY),
                    colorSupplier.getRandomColor());
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };

    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }

    private double randomDouble(double min, double max) {
        return Math.floor((min + random.nextDouble() * (max - min)) * 100) / 100;
    }
}

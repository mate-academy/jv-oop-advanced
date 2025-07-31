package main;

import core.basesyntax.Circle;
import core.basesyntax.Figure;
import core.basesyntax.IsoscelesTrapezoid;
import core.basesyntax.Rectangle;
import core.basesyntax.RightTriangle;
import core.basesyntax.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 20;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0: {
                double radius = roundTo(random.nextDouble() * MAX_SIZE + 1);
                return new Circle(radius, color);
            }

            case 1: {
                double base1 = roundTo(random.nextDouble() * MAX_SIZE + 1);
                double base2 = roundTo(random.nextDouble() * MAX_SIZE + 1);
                double leg = roundTo(Math.abs(base1 - base2) / 2 + random.nextDouble() + MAX_SIZE);
                double height = roundTo(random.nextDouble() * MAX_SIZE + 1);
                return new IsoscelesTrapezoid(base1, base2, leg, height, color);
            }

            case 2: {
                double width = roundTo(random.nextDouble() * MAX_SIZE + 1);
                double height = roundTo(random.nextDouble() * MAX_SIZE + 1);
                return new Rectangle(width, height, color);
            }

            case 3: {
                double firstLeg = roundTo(random.nextDouble() * MAX_SIZE + 1);
                double secondLeg = roundTo(random.nextDouble() * MAX_SIZE + 1);
                return new RightTriangle(firstLeg, secondLeg, color);
            }

            case 4: {
                double side = roundTo(random.nextDouble() * MAX_SIZE + 1);
                return new Square(side, color);
            }

            default: {
                throw new IllegalStateException("Unexpected value");
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }

    public static double roundTo(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}

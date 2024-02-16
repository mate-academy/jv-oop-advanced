package core.basesyntax.supplier;

import core.basesyntax.Color;
import core.basesyntax.Shape;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_UNITS = 10;
    private static final int MIN_RANDOM_UNITS = 1;
    private static final int MAX_RANDOM_UNITS = 11;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomShape = random.nextInt(Shape.values().length);
        String randomColor = colorSupplier.getRandomColor();

        return switch (randomShape) {
            case 0 -> new Square(randomColor, getRandomUnits());
            case 1 -> new Rectangle(randomColor, getRandomUnits(), getRandomUnits());
            case 2 -> new RightTriangle(randomColor, getRandomUnits(), getRandomUnits());
            case 3 -> new Circle(randomColor, getRandomUnits());
            case 4 -> new IsoscelesTrapezoid(
                    randomColor, getRandomUnits(), getRandomUnits(), getRandomUnits());
            default -> throw new IllegalArgumentException("Unexpected value: " + randomShape);
        };
    }

    public Figure getDefaultFigure() {
        String defaultColor = Color.WHITE.name();
        return new Circle(defaultColor, DEFAULT_UNITS);
    }

    private int getRandomUnits() {
        return random.nextInt(MIN_RANDOM_UNITS, MAX_RANDOM_UNITS);
    }
}

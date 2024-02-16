package core.basesyntax.supplier;

import core.basesyntax.Colors;
import core.basesyntax.Figure;
import core.basesyntax.Shapes;
import core.basesyntax.figure.Circle;
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
        int randomShape = random.nextInt(Shapes.values().length);
        String randomColor = colorSupplier.getRandomColor();
        int randomUnits = random.nextInt(MIN_RANDOM_UNITS, MAX_RANDOM_UNITS);

        return switch (randomShape) {
            case 0 -> new Square(randomColor, randomUnits);
            case 1 -> new Rectangle(randomColor, randomUnits, randomUnits);
            case 2 -> new RightTriangle(randomColor, randomUnits, randomUnits);
            case 3 -> new Circle(randomColor, randomUnits);
            case 4 -> new IsoscelesTrapezoid(randomColor, randomUnits, randomUnits, randomUnits);
            default -> throw new IllegalArgumentException("Unexpected value: " + randomShape);
        };
    }

    public Figure getDefaultFigure() {
        String defaultColor = Colors.WHITE.name();
        return new Circle(defaultColor, DEFAULT_UNITS);
    }
}

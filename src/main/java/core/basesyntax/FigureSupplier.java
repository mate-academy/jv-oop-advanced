package core.basesyntax;

import core.basesyntax.enums.Type;
import core.basesyntax.figures.Square;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import java.util.Random;

public class FigureSupplier {
    private static final int MIN = 1;
    private static final int MAX = 20;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int indexOfType = random.nextInt(Type.values().length);
        Type type = Type.values()[indexOfType];
        String color = colorSupplier.getRandomColor();
        int sideA = random.nextInt(MIN, MAX);
        int sideB = random.nextInt(MIN, MAX);
        int sideC = random.nextInt(MIN, MAX);
        return switch (type) {
            case SQUARE -> new Square(sideA, color);
            case RECTANGLE -> new Rectangle(sideA, sideB, color);
            case TRIANGLE -> new RightTriangle(sideA, sideB, color);
            case CIRCLE -> new Circle(sideA, color);
            case TRAPEZOID -> new IsoscelesTrapezoid(sideA, sideB, sideC, color);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS);
    }
}

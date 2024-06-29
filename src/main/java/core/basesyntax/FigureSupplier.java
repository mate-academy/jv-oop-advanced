package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.Type;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MIN = 1;
    private static final int MAX = 20;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int indexOfType = random.nextInt(Type.values().length);
        Type type = Type.values()[indexOfType];
        String color = colorSupplier.getRandomColor();
        return switch (type) {
            case SQUARE -> new Square(randomSide(), color);
            case RECTANGLE -> new Rectangle(randomSide(), randomSide(), color);
            case TRIANGLE -> new RightTriangle(randomSide(), randomSide(), color);
            case CIRCLE -> new Circle(randomSide(), color);
            case TRAPEZOID -> new IsoscelesTrapezoid(randomSide(), randomSide(), randomSide(), color);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private int randomSide() {
        return random.nextInt(MIN, MAX);
    }
}

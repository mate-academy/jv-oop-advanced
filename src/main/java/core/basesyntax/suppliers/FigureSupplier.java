package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private final Random random;
    private final ColorSupplier colorSupplier;
    private Shape figure;

    public FigureSupplier() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int index = random.nextInt(Shape.values().length);
        figure = Shape.values()[index];

        switch (figure) {
            case CIRCLE:
                return new Circle(color, getRandomNumber());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(color, getRandomNumber(),
                                              getRandomNumber(), getRandomNumber());
            case RECTANGLE:
                return new Rectangle(color, getRandomNumber(), getRandomNumber());
            case RIGHT_TRIANGLE:
                return new RightTriangle(color, getRandomNumber(), getRandomNumber());
            case SQUARE:
                return new Square(color, getRandomNumber());
            default: return null;
        }
    }

    private double getRandomNumber() {
        return random.nextDouble() * MAX_VALUE;
    }

    public core.basesyntax.figures.Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}

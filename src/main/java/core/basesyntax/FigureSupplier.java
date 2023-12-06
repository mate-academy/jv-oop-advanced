package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_SHAPES = 5;
    private static final int SQUARE = 0;
    private static final int RECTANGLE = 1;
    private static final int RIGHT_TRIANGLE = 2;
    private static final int CIRCLE = 3;
    private static final int TRAPEZOID = 4;
    private static final String DEFAULT_COLOR = "White";
    private static final int DEFAULT_SIZE = 10;
    private final ColorSupplier colorSupplier;
    private final Random random = new Random();
    private final int randomShape = random.nextInt(NUMBER_OF_SHAPES);

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        return switch (randomShape) {
            case SQUARE -> new Square(colorSupplier.getRandomColor(), getRandomSize());
            case RECTANGLE -> new Rectangle(colorSupplier
                    .getRandomColor(),
                    getRandomSize(),
                    getRandomSize());
            case RIGHT_TRIANGLE -> new RightTriangle(colorSupplier
                    .getRandomColor(),
                    getRandomSize(),
                    getRandomSize());
            case CIRCLE -> new Circle(colorSupplier.getRandomColor(), getRandomSize());
            case TRAPEZOID -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    getRandomSize(), getRandomSize(), getRandomSize());
            default -> throw new IllegalArgumentException("Invalid shape index");
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_SIZE);
    }

    private int getRandomSize() {
        return random.nextInt(10) + 1;
    }
}

package core.basesyntax.utils;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Color;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_SIDE_LENGTH = 100;
    private static final int FIGURE_CIRCLE = 0;
    private static final int FIGURE_ISOSCELES_TRAPEZOID = 1;
    private static final int FIGURE_RECTANGLE = 2;
    private static final int FIGURE_RIGHT_TRIANGLE = 3;
    private static final int FIGURE_SQUARE = 4;
    private static final int FIGURE_COUNT = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        int figure = random.nextInt(FIGURE_COUNT);

        return switch (figure) {
            case FIGURE_CIRCLE -> new Circle(color, random.nextDouble(MAX_SIDE_LENGTH));
            case FIGURE_ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(color,
                    random.nextDouble(MAX_SIDE_LENGTH),
                    random.nextDouble(MAX_SIDE_LENGTH),
                    random.nextDouble(MAX_SIDE_LENGTH));
            case FIGURE_RECTANGLE -> new Rectangle(color,
                    random.nextDouble(MAX_SIDE_LENGTH),
                    random.nextDouble(MAX_SIDE_LENGTH));
            case FIGURE_RIGHT_TRIANGLE -> new RightTriangle(color,
                    random.nextDouble(MAX_SIDE_LENGTH),
                    random.nextDouble(MAX_SIDE_LENGTH));
            case FIGURE_SQUARE -> new Square(color, random.nextDouble(MAX_SIDE_LENGTH));
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}

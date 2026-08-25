package core.basesyntax.figuresupplier;

import core.basesyntax.colorsupplier.ColorSupplier;
import core.basesyntax.colorsupplier.Colors;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX = 100;
    private static final String DEFAULT_COLOR = Colors.WHITE.name();
    private static final double DEFAULT_RADIUS = 10.0;
    private static final Figure DEFAULT_FIGURE = new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);

    private final Random random = new Random();
    private final Figures[] figures = Figures.values();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figures figure = figures[random.nextInt(figures.length)];
        String color = colorSupplier.getRandomColor();
        int randomValue = random.nextInt(MAX);

        return switch (figure) {
            case CIRCLE -> new Circle(color, randomValue);

            case ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(color, randomValue,
                    random.nextInt(MAX), random.nextInt(MAX));

            case RECTANGLE -> new Rectangle(color, randomValue, random.nextInt(MAX));

            case RIGHT_TRIANGLE -> new RightTriangle(color, randomValue, random.nextInt(MAX));

            case SQUARE -> new Square(color, randomValue);
        };
    }

    public Figure getDefaultFigure() {
        return DEFAULT_FIGURE;
    }
}

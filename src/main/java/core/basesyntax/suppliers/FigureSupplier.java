package core.basesyntax.suppliers;

import core.basesyntax.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {

    private static final int RANDOM_NUMBER_FIGURE_RANGE = 5;
    private static final double RANDOM_BOUND = 100.00;
    private static final double DEFAULT_CIRCLE_VALUE = 10.0;
    private static final String WHITE_COLOR_CIRCLE = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(RANDOM_NUMBER_FIGURE_RANGE);
        String randomColor = colorSupplier.getRandomColor();

        return switch (randomFigureNumber) {
            case 0 -> new Circle(randomColor, randomSize());
            case 1 -> new IsoscelesTrapezoid(randomColor, randomSize(),
                                                      randomSize(), randomSize());
            case 2 -> new Rectangle(randomColor, randomSize(), randomSize());
            case 3 -> new RightTriangle(randomColor, randomSize(), randomSize());
            case 4 -> new Square(randomColor, randomSize());
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE_COLOR_CIRCLE, DEFAULT_CIRCLE_VALUE);
    }

    private double randomSize() {
        return random.nextDouble(RANDOM_BOUND);
    }
}

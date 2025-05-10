package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Color;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_TYPES_AMOUNT = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();

    private final Random random = new Random();

    public Figure getRandomFigure() {
        return switch (random.nextInt(FIGURE_TYPES_AMOUNT)) {
            case 0 -> new Circle(getRandomColor(), getRandomNumber());
            case 1 -> new Rectangle(getRandomColor(), getRandomNumber(), getRandomNumber());
            case 2 -> new RightTriangle(getRandomColor(), getRandomNumber(), getRandomNumber());
            case 3 -> new Square(getRandomColor(), getRandomNumber());
            default -> new IsoscelesTrapezoid(
                    getRandomColor(),
                    getRandomNumber(),
                    getRandomNumber(),
                    getRandomNumber());
        };
    }

    private String getRandomColor() {
        return new ColorSupplier().getRandomColor();
    }

    private int getRandomNumber() {
        return random.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}

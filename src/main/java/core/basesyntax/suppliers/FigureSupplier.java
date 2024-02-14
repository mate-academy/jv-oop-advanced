package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int MIN_RANDOM_NUMBER = 1;
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int DEFAULT_RADIUS = 10;
    public static final int FIGURE_TYPES_AMOUNT = 6;
    public static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        return switch (random.nextInt(FIGURE_TYPES_AMOUNT)) {
            case 0 -> new Circle(getRandomColor(), getRandomNumber());
            case 1 -> new Rectangle(getRandomColor(), getRandomNumber(), getRandomNumber());
            case 2 -> new RightTriangle(getRandomColor(), getRandomNumber(), getRandomNumber());
            case 3 -> new Square(getRandomColor(), getRandomNumber());
            case 4 -> new IsoscelesTrapezoid(
                    getRandomColor(),
                    getRandomNumber(),
                    getRandomNumber(),
                    getRandomNumber());
            default -> new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
        };
    }

    private String getRandomColor() {
        return colorSupplier.getRandomColor();
    }

    private int getRandomNumber() {
        return random.nextInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
    }
}

package utility;

import core.basesyntax.Circle;
import core.basesyntax.IsoscelesTrapezoid;
import core.basesyntax.Rectangle;
import core.basesyntax.RightTriangle;
import core.basesyntax.Square;
import java.util.Random;
import model.Color;
import model.Figure;

public class FigureSupplier {
    public static final String DEFAULT_COLOR = "white";
    public static final double DEFAULT_DATA = 10;
    public static final int MIN_RANDOM_VALUE = 1;
    public static final int MAX_RANDOM_VALUE = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final Color[] colors = Color.values();

    public Figure getRandomFigure() {
        int figurIndex = random.nextInt(colors.length);
        return switch (figurIndex) {

            case 0 -> new Circle(colorSupplier.getRandomColor(),
                    generateRandomSideLength());
            case 1 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    generateRandomSideLength(),
                    generateRandomSideLength(),
                    generateRandomSideLength());
            case 2 -> new Rectangle(colorSupplier.getRandomColor(),
                    generateRandomSideLength(),
                    generateRandomSideLength());
            case 3 -> new RightTriangle(colorSupplier.getRandomColor(),
                    generateRandomSideLength(),
                    generateRandomSideLength());
            default -> new Square(colorSupplier.getRandomColor(),
                    generateRandomSideLength());
        };
    }

    public double generateRandomSideLength() {
        return random.nextInt(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_DATA);
    }
}

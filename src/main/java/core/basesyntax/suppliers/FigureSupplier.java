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
    private static final int COUNT_OF_FIGURES = 5;
    private static final double MAX_LENGTH = 25.0;
    private static final double MIN_LENGTH = 1.0;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final double DEFAULT_LENGTH = 10.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_LENGTH);
    }

    public Figure getRandomFigure() {
        int indexOfRandomFigure = random.nextInt(COUNT_OF_FIGURES);
        String color = colorSupplier.getRandomColor();
        switch (indexOfRandomFigure) {
            case 0:
                return new Circle(color, getRandomLength());
            case 1:
                return new IsoscelesTrapezoid(color, getRandomLength(),
                        getRandomLength(), getRandomLength());
            case 2:
                return new Rectangle(color, getRandomLength(), getRandomLength());
            case 3:
                return new RightTriangle(color, getRandomLength(), getRandomLength());
            case 4:
                return new Square(color, getRandomLength());
            default:
                return getDefaultFigure();
        }
    }

    private double getRandomLength() {
        return random.nextDouble(MIN_LENGTH, MAX_LENGTH);
    }
}

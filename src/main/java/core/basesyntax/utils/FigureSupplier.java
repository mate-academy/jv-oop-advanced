package core.basesyntax.utils;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_RANGE_MAX = 10;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureType randomFigureType = getRandomFigureType();

        switch (randomFigureType) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), getRandomNumber());
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), getRandomNumber());
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomNumber(),
                        getRandomNumber());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomNumber(),
                        getRandomNumber(),
                        getRandomNumber());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, RANDOM_RANGE_MAX);
    }

    private double getRandomNumber() {
        return Math.round(random.nextDouble() * RANDOM_RANGE_MAX + 1);
    }

    private FigureType getRandomFigureType() {
        FigureType[] types = FigureType.values();
        int randomIndex = random.nextInt(types.length);
        return types[randomIndex];
    }
}

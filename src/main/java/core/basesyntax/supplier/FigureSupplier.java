package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MIN_RANDOM_SIZE = 1;
    private static final double MAX_RANDOM_SIZE = 11;
    private static final double DEFAULT_RADIUS = 10;

    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = supplier.getRandomColor();
        FigureType[] types = FigureType.values();
        FigureType randomFigure = types[random.nextInt(types.length)];

        return switch (randomFigure) {
            case SQUARE -> new Square(color, getRandomSize());
            case RECTANGLE -> new Rectangle(color, getRandomSize(), getRandomSize());
            case RIGHT_TRIANGLE -> new RightTriangle(color, getRandomSize(), getRandomSize());
            case CIRCLE -> new Circle(color, getRandomSize());
            case ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(color, getRandomSize(),
                    getRandomSize(), getRandomSize());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_RADIUS);
    }

    private double getRandomSize() {
        return random.nextDouble(MIN_RANDOM_SIZE, MAX_RANDOM_SIZE);
    }
}

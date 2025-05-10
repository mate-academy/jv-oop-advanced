package core.basesyntax.supplier;

import core.basesyntax.constant.Color;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int NUMBERS_OF_FIGURES = 5;
    private static final int DEFAULT_RADIUS_FOR_CIRCLE = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int type = random.nextInt(NUMBERS_OF_FIGURES);
        return switch (type) {
            case 0 -> new Rectangle(colorSupplier.getRandomColor(),
                    getRandomDouble(), getRandomDouble());
            case 1 -> new Square(colorSupplier.getRandomColor(), getRandomDouble());
            case 2 -> new RightTriangle(colorSupplier.getRandomColor(),
                    getRandomDouble(), getRandomDouble());
            case 3 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    getRandomDouble(), getRandomDouble());
            case 4 -> new Circle(colorSupplier.getRandomColor(), getRandomDouble());
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS_FOR_CIRCLE);
    }

    private double getRandomDouble() {
        return random.nextDouble();
    }
}

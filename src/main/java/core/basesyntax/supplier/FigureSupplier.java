package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_RANDOM_VALUE = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomValue = getRandomValue();
        switch (randomValue % 5) {
            case (0):
                return new Circle(colorSupplier.getRandomColor(), getRandomValue());
            case (1):
                return new Square(colorSupplier.getRandomColor(), getRandomValue());
            case (2):
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue());
            case (3):
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue(), getRandomValue());
            case (4):
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue());
            default:
                return getRandomFigure();

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }

    private int getRandomValue() {
        return random.nextInt(MAX_RANDOM_VALUE);
    }
}

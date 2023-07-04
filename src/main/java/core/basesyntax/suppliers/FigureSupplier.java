package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;

import java.util.Random;

public class FigureSupplier {
    private static final int MAXIMUM_RANDOM_GET_FIGURE = 5;
    private static final int MAXIMUM_RANDOM_SIZE = 50;
    private static final int DEFAULT_RADIUS_SIZE = 50;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int rand = random.nextInt(MAXIMUM_RANDOM_GET_FIGURE);
        switch (rand) {
            case 0:
                return new Rectangle(getRandomColor(),
                        getRandomSize(), getRandomSize());
            case 1:
                return new RightTriangle(getRandomColor(),
                        getRandomSize(), getRandomSize());
            case 2:
                return new IsoscelesTrapezoid(getRandomColor(),
                        getRandomSize(), getRandomSize(), getRandomSize());
            case 3:
                return new Circle(getRandomColor(),
                        getRandomSize());
            default:
                return new Square(getRandomColor(),
                        getRandomSize());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS_SIZE);
    }

    private int getRandomSize() {
        return random.nextInt(MAXIMUM_RANDOM_SIZE);
    }

    private Color getRandomColor() {
        return colorSupplier.getRandomColor();
    }
}

package core.basesyntax.supplier;

import core.basesyntax.Color;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANGE_BOUND = 10;
    private static final String DEFAULT_COLOR_NAME = Color.WHITE.name();
    private static final double DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int figureCount = 5;

    public Figure getRandomFigure() {
        int figureOrderNumber = random.nextInt(1, figureCount);

        switch (figureOrderNumber) {
            case 1:
                return getRandomCircle();

            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRightTriangle();

            case 4:
                return getRandomSquare();

            case 5:
                return getRandomRectangle();

            default:
                break;
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR_NAME, DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(1, MAX_RANGE_BOUND));
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(1, MAX_RANGE_BOUND),
                random.nextInt(1, MAX_RANGE_BOUND), random.nextInt(1, MAX_RANGE_BOUND),
                random.nextInt(1, MAX_RANGE_BOUND));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(1, MAX_RANGE_BOUND),
                random.nextInt(1, MAX_RANGE_BOUND));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(1, MAX_RANGE_BOUND),
                random.nextInt(1, MAX_RANGE_BOUND));
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(1, MAX_RANGE_BOUND));
    }

}

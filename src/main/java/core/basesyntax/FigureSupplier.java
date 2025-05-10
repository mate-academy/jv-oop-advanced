package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int MAX_RANDOM_VALUE = 50;
    private static final int DEFAULT_RADIUS = 10;

    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_COUNT)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomSquare();
            default:
                return getDefaultCircle();
        }
    }

    public Circle getDefaultCircle() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_VALUE));
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE));
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),random.nextInt(MAX_RANDOM_VALUE));
    }
}

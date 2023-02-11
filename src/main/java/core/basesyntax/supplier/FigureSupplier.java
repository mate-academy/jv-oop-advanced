package core.basesyntax.supplier;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_SIZE = 100;
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURE_COUNT);
        switch (randomFigure) {
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
                return getDefaultFigure();
        }
    }

    private int getRandomSize() {
        return random.nextInt(MAX_FIGURE_SIZE);
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomSize());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomSize(),
                getRandomSize(), getRandomSize());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomSize(), getRandomSize());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomSize(), getRandomSize());
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomSize());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}

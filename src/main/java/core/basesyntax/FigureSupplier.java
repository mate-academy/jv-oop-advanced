package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int DEFAULT_CIRCLE_RADIUS = 10;
    public static final int LOWER_BOUND = 1;
    public static final int UPPER_BOUND = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0: return getRandomCircle();
            case 1: return getRandomIsoscelesTrapezoid();
            case 2: return getRandomRectangle();
            case 3: return getRandomRightTriangle();
            case 4: return getRandomSquare();
            default: return getDefaultFigure();
        }
    }

    //Generate figures with random sides from LOWER_BOUND to UPPER_BOUND units
    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(UPPER_BOUND) + LOWER_BOUND);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(UPPER_BOUND) + LOWER_BOUND,
                random.nextInt(UPPER_BOUND) + LOWER_BOUND,
                random.nextInt(UPPER_BOUND) + LOWER_BOUND);
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(UPPER_BOUND) + LOWER_BOUND,
                random.nextInt(UPPER_BOUND) + LOWER_BOUND);
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(UPPER_BOUND) + LOWER_BOUND,
                random.nextInt(UPPER_BOUND) + LOWER_BOUND);
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(UPPER_BOUND) + LOWER_BOUND);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_CIRCLE_RADIUS);
    }
}

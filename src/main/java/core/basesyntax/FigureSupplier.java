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
        int radius = random.nextInt(UPPER_BOUND) + LOWER_BOUND;
        return new Circle(colorSupplier.getRandomColor(), radius);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int firstSide = random.nextInt(UPPER_BOUND) + LOWER_BOUND;
        int secondSide = random.nextInt(UPPER_BOUND) + LOWER_BOUND;
        int height = random.nextInt(UPPER_BOUND) + LOWER_BOUND;
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                firstSide, secondSide, height);
    }

    private Rectangle getRandomRectangle() {
        int width = random.nextInt(UPPER_BOUND) + LOWER_BOUND;
        int height = random.nextInt(UPPER_BOUND) + LOWER_BOUND;
        return new Rectangle(colorSupplier.getRandomColor(), width, height);
    }

    private RightTriangle getRandomRightTriangle() {
        int firstLeg = random.nextInt(UPPER_BOUND) + LOWER_BOUND;
        int secondLeg = random.nextInt(UPPER_BOUND) + LOWER_BOUND;
        return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
    }

    private Square getRandomSquare() {
        int side = random.nextInt(UPPER_BOUND) + LOWER_BOUND;
        return new Square(colorSupplier.getRandomColor(), side);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_CIRCLE_RADIUS);
    }
}

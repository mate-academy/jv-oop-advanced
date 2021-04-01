package core.basesyntax;

import core.basesyntax.shapes.Circle;
import core.basesyntax.shapes.IsoscelesTrapezoid;
import core.basesyntax.shapes.Rectangle;
import core.basesyntax.shapes.RightTriangle;
import core.basesyntax.shapes.Shape;
import core.basesyntax.shapes.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int TOTAL_SHAPE_NUMBER = 5;
    private static final int RADIUS_LIMIT = 10;
    private static final int LENGTH_LIMIT = 50;
    private static final int WIDTH_LIMIT = 50;
    private static final int UPPER_BASE = 50;
    private static final int LOWER_BASE_EXCESS_UPPER_BASE = 20;
    private static final int MINIMAL_LOWER_BASE = 51;

    public Shape generateShape() {
        Random random = new Random();
        int figureType = random.nextInt(TOTAL_SHAPE_NUMBER);
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (figureType) {
            case 1:
                return new Circle("circle",
                        colorSupplier.generateColor(),
                        random.nextInt(RADIUS_LIMIT));
            case 2:
                return new IsoscelesTrapezoid("isosceles trapezoid",
                        colorSupplier.generateColor(),
                        MINIMAL_LOWER_BASE + random.nextInt(LOWER_BASE_EXCESS_UPPER_BASE),
                        random.nextInt(UPPER_BASE),
                        random.nextInt(WIDTH_LIMIT));
            case 3:
                return new Rectangle("rectangle",
                        colorSupplier.generateColor(),
                        random.nextInt(LENGTH_LIMIT),
                        random.nextInt(WIDTH_LIMIT));
            case 4:
                return new RightTriangle("triangle",
                        colorSupplier.generateColor(),
                        random.nextInt(LENGTH_LIMIT),
                        random.nextInt(WIDTH_LIMIT));
            default:
                return new Square("square",
                        colorSupplier.generateColor(),
                        random.nextInt(LENGTH_LIMIT));
        }
    }
}

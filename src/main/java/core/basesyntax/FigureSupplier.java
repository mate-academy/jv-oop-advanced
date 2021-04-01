package core.basesyntax;

import core.basesyntax.shapes.Circle;
import core.basesyntax.shapes.IsoscelesTrapezoid;
import core.basesyntax.shapes.Rectangle;
import core.basesyntax.shapes.RightTriangle;
import core.basesyntax.shapes.Shape;
import core.basesyntax.shapes.Square;

public class FigureSupplier {

    private static final int TOTAL_SHAPE_NUMBER = 5;
    private static final int RADIUS_LIMIT = 10;
    private static final int LENGTH_LIMIT = 50;
    private static final int WIDTH_LIMIT = 50;
    private static final int UPPER_BASE = 50;
    private static final int LOWER_BASE_EXCESS_UPPER_BASE = 20;
    private static final int MINIMAL_LOWER_BASE = 51;

    public Shape generateShape() {
        int figureType = (int) (Math.random() * TOTAL_SHAPE_NUMBER);
        ColorSupplier color = new ColorSupplier();
        switch (figureType) {
            case 1:
                return new Circle("circle",
                        color.generateColor(),
                        (int) (Math.random() * RADIUS_LIMIT) + 1);
            case 2:
                return new IsoscelesTrapezoid("isosceles trapezoid",
                        color.generateColor(),
                        // lower base should be longer than upper base. always
                        (int) (Math.random() * LOWER_BASE_EXCESS_UPPER_BASE) + MINIMAL_LOWER_BASE,
                        (int) (Math.random() * UPPER_BASE) + 1,
                        (int) (Math.random() * WIDTH_LIMIT) + 1);
            case 3:
                return new Rectangle("rectangle",
                        color.generateColor(),
                        (int) (Math.random() * LENGTH_LIMIT) + 1,
                        (int) (Math.random() * WIDTH_LIMIT) + 1);
            case 4:
                return new RightTriangle("triangle",
                        color.generateColor(),
                        (int) (Math.random() * LENGTH_LIMIT) + 1,
                        (int) (Math.random() * WIDTH_LIMIT) + 1);
            default:
                return new Square("square",
                        color.generateColor(),
                        (int) (Math.random() * LENGTH_LIMIT) + 1);
        }
    }
}

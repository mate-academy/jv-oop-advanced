package core.basesyntax;

import core.basesyntax.shapes.*;

public class FigureSupplier {

    private static final int TOTAL_SHAPE_NUMBER = 5;
    private static final int RADIUS_LIMIT = 10;
    private static final int LENGTH_LIMIT = 50;
    private static final int WIDTH_LIMIT = 50;
    private static final int UPPER_BASE = 70;
    private static final int LOWER_BASE = 50;

    public Shape generateShape() {
        int figureType = (int) (Math.random() * TOTAL_SHAPE_NUMBER);
        ColorSupplier color = new ColorSupplier();
        switch (figureType) {
            case 1:
                return new Circle("circle",
                        color.generateColor(),
                        (int) (Math.random() * RADIUS_LIMIT));
            case 2:
                return new IsoscelesTrapezoid("isosceles trapezoid",
                        color.generateColor(),
                        (int) (Math.random() * LOWER_BASE),
                        (int) (Math.random() * UPPER_BASE),
                        (int) (Math.random() * WIDTH_LIMIT));
            case 3:
                return new Rectangle("rectangle",
                        color.generateColor(),
                        (int) (Math.random() * LENGTH_LIMIT),
                        (int) (Math.random() * WIDTH_LIMIT));
            case 4:
                return new RightTriangle("right triangle",
                        color.generateColor(),
                        (int) (Math.random() * LENGTH_LIMIT),
                        (int) (Math.random() * WIDTH_LIMIT));
            default:
                return new Square("square",
                        color.generateColor(),
                        (int) (Math.random() * LENGTH_LIMIT));
        }
    }
}

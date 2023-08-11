package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    enum Shape { CIRCLE, SQUARE, RECTANGLE, TRIANGLE, TRAPEZOID }

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {

        switch (Shape.values()[random.nextInt(Shape.values().length)]) {
            case CIRCLE:
                return new Circle(random.nextInt(10) + 1,
                                        colorSupplier.gerRandomColor());
            case SQUARE:
                return new Square(random.nextInt(10) + 1,
                                       colorSupplier.gerRandomColor());
            case RECTANGLE:
                return new Rectangle(random.nextInt(10) + 1,
                                      random.nextInt(10) + 1,
                                              colorSupplier.gerRandomColor());
            case TRIANGLE:
                return new RightTriangle(random.nextInt(10) + 1,
                                       random.nextInt(10) + 1,
                                                 colorSupplier.gerRandomColor());
            default:
                return new IsoscelesTrapezoid(random.nextInt(10) + 1,
                                           random.nextInt(10) + 1,
                                               random.nextInt(10) + 1,
                                                     colorSupplier.gerRandomColor());
        }
    }

    public Figure getDefoltFigure() {
        return new Circle(10, ColorSupplier.Color.WHITE.name());
    }
}

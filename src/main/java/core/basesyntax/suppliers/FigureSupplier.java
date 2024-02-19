package core.basesyntax.suppliers;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_INDEX = GeometricFigure.values().length;
    private static final int SIZE_BOUND = 99;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(MAX_FIGURE_INDEX);
        int size1 = random.nextInt(SIZE_BOUND) + 1;
        int size2 = random.nextInt(SIZE_BOUND) + 1;
        int size3 = random.nextInt(SIZE_BOUND) + 1;

        GeometricFigure figure = GeometricFigure.values()[index];
        String color = colorSupplier.getRandomColor();

        switch (figure) {
            case SQUARE -> {
                return new Square(color, size1);
            }
            case TRIANGLE -> {
                return new RightTriangle(color, size1, size2);
            }
            case RECTANGLE -> {
                return new Rectangle(color, size1, size2);
            }
            case TRAPEZOID -> {
                return new IsoscelesTrapezoid(color, size1, size2, size3);
            }
            default -> {
                return new Circle(color, size1);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}

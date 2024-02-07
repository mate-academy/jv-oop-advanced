package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int BOUND_NUMBER = 25;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_NUMBER = 5;
    private final ColorSupplier supplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int number = random.nextInt(FIGURE_NUMBER);
        switch (number) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
            default:
                return getRandomRightTriangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomCircle() {
        return new Circle(
                supplier.getRandomColor(),
                random.nextInt(BOUND_NUMBER)
        );
    }

    private Figure getRandomSquare() {
        return new Square(
                supplier.getRandomColor(),
                random.nextInt(BOUND_NUMBER)
        );
    }

    private Figure getRandomRectangle() {
        return new Rectangle(
                supplier.getRandomColor(),
                random.nextInt(BOUND_NUMBER),
                random.nextInt(BOUND_NUMBER)
        );
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(
                supplier.getRandomColor(),
                random.nextInt(BOUND_NUMBER),
                random.nextInt(BOUND_NUMBER)
        );
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                supplier.getRandomColor(),
                random.nextInt(BOUND_NUMBER),
                random.nextInt(BOUND_NUMBER),
                random.nextInt(BOUND_NUMBER)
        );
    }
}

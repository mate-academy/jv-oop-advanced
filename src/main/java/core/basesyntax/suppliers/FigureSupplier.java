package core.basesyntax.suppliers;

import core.basesyntax.figure.Figure;
import core.basesyntax.figure.figures.Circle;
import core.basesyntax.figure.figures.IsoscelesTrapezoid;
import core.basesyntax.figure.figures.Rectangle;
import core.basesyntax.figure.figures.RightTriangle;
import core.basesyntax.figure.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int DEFAULT_SIZE = 100;
    private static final String DEFAULT_COLOR = "WHITE";
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle("CIRCLE", DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRightTriangle();
            case 3:
                return getIsoscelesTrapezoid();
            case 4:
                return getCircle();
            default:
                return getDefaultFigure();
        }
    }

    private Square getRandomSquare() {
        return new Square(
            "Square",
            colorSupplier.getRandomColor(),
            random.nextInt(DEFAULT_SIZE));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(
            "Rectangle",
            colorSupplier.getRandomColor(),
            random.nextInt(DEFAULT_SIZE),
            random.nextInt(DEFAULT_SIZE));
    }

    private RightTriangle getRightTriangle() {
        return new RightTriangle(
            "Right Triangle",
            colorSupplier.getRandomColor(),
            random.nextInt(DEFAULT_SIZE));
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
            "Isosceles Trapezoid",
            colorSupplier.getRandomColor(),
            random.nextInt(DEFAULT_SIZE),
            random.nextInt(DEFAULT_SIZE),
            random.nextDouble());
    }

    private Circle getCircle() {
        return new Circle(
            "Circle",
            colorSupplier.getRandomColor(),
            random.nextInt(DEFAULT_SIZE));
    }
}

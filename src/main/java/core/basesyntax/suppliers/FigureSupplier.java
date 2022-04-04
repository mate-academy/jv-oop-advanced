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
    private final String colorSupplier = new ColorSupplier().getRandomColor();
    private final Random random = new Random();

    private Square getRandomSquare() {
        Square square = new Square(
                "Square",
                colorSupplier,
                random.nextInt(DEFAULT_SIZE));
        return square;
    }

    private Rectangle getRandomRectangle() {
        Rectangle rectangle = new Rectangle(
                "Rectangle",
                colorSupplier,
                random.nextInt(DEFAULT_SIZE),
                random.nextInt(DEFAULT_SIZE));
        return rectangle;
    }

    private RightTriangle getRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle(
                "Right Triangle",
                colorSupplier,
                random.nextInt(DEFAULT_SIZE));
        return rightTriangle;
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(
                "Isosceles Trapezoid",
                colorSupplier,
                random.nextInt(DEFAULT_SIZE),
                random.nextInt(DEFAULT_SIZE),
                random.nextDouble(DEFAULT_SIZE));
        return isoscelesTrapezoid;
    }

    private Circle getCircle() {
        Circle circle = new Circle(
                "Circle",
                colorSupplier,
                random.nextInt(DEFAULT_SIZE));
        return circle;
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

    public Figure getDefaultFigure() {
        return new Circle("CIRCLE", DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}

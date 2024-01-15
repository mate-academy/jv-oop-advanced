package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_TYPES = 5;
    public static final double MIN_SIZE = 1.0d;
    public static final double MAX_SIZE = 12.0d;
    public static final double DEFAULT_RADIUS = 10.0d;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;
        switch (random.nextInt(NUMBER_OF_TYPES)) {
            case 0:
                figure = getRandomIsoscelesTrapezoid();
                break;
            case 1:
                figure = getRandomRectangle();
                break;
            case 2:
                figure = getRandomRightTriangle();
                break;
            case 3:
                figure = getRandomSquare();
                break;
            case 4:
                figure = getRandomCircle();
                break;
            default:
                figure = getDefaultFigure();
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(colorSupplier.getDefaultColor(), DEFAULT_RADIUS);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomDouble(),
                getRandomDouble(),
                getRandomDouble());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomDouble(),
                getRandomDouble());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomDouble(),
                getRandomDouble());
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                getRandomDouble());
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                getRandomDouble());
    }

    private double getRandomDouble() {
        return MIN_SIZE + (MAX_SIZE - MIN_SIZE) * random.nextDouble();
    }
}

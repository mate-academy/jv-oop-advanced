package core.basesyntax.suppliers;

import core.basesyntax.constants.Color;
import core.basesyntax.constants.FigureType;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        FigureType figureType = FigureType.values()[random.nextInt(FigureType.values().length)];
        switch (figureType) {
            case CIRCLE:
                return getRandomCircle();
            case ISOSCELES_TRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            case RECTANGLE:
                return getRandomRectangle();
            case RIGHT_TRIANGLE:
                return getRandomRightTriangle();
            case SQUARE:
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        return new Circle(
                colorSupplier.getRandomColor(),
                random.nextInt());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                random.nextInt(),
                random.nextInt(),
                random.nextInt());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(
                colorSupplier.getRandomColor(),
                random.nextInt(),
                random.nextInt());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(
                colorSupplier.getRandomColor(),
                random.nextInt(),
                random.nextInt());
    }

    private Square getRandomSquare() {
        return new Square(
                colorSupplier.getRandomColor(),
                random.nextInt());
    }
}

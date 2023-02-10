package core.basesyntax.service;

import core.basesyntax.entity.Circle;
import core.basesyntax.entity.Figure;
import core.basesyntax.entity.IsoscelesTrapezoid;
import core.basesyntax.entity.Rectangle;
import core.basesyntax.entity.RightTriangle;
import core.basesyntax.entity.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return getDefaultCircle();
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextDouble() * Circle.MAX_RADIUS);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextDouble() * IsoscelesTrapezoid.MAX_HIGH,
                random.nextDouble() * IsoscelesTrapezoid.MAX_UPPER_BASE,
                random.nextDouble() * IsoscelesTrapezoid.MAX_LOWER_BASE);
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextDouble() * Rectangle.MAX_FIRST_SIDE,
                random.nextDouble() * Rectangle.MAX_SECOND_SIDE);
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextDouble() * RightTriangle.MAX_LEFT_LEG,
                random.nextDouble() * RightTriangle.MAX_RIGHT_LEG);
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextDouble() * Square.MAX_SIDE);
    }

    private Circle getDefaultCircle() {
        return new Circle(Figure.DEFAULT_COLOR, Circle.DEFAULT_RADIUS);
    }
}

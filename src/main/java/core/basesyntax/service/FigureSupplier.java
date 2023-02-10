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
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                return getDefaultCircle();
            case 1:
                return getDefaultIsoscelesTrapezoid();
            case 2:
                return getDefaultRectangle();
            case 3:
                return getDefaultRightTriangle();
            default:
                return getDefaultSquare();
        }
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

    private IsoscelesTrapezoid getDefaultIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(Figure.DEFAULT_COLOR,
                IsoscelesTrapezoid.DEFAULT_HIGH,
                IsoscelesTrapezoid.DEFAULT_UPPER_BASE,
                IsoscelesTrapezoid.DEFAULT_LOWER_BASE);
    }

    private Rectangle getDefaultRectangle() {
        return new Rectangle(Figure.DEFAULT_COLOR,
                Rectangle.DEFAULT_FIRST_SIDE,
                Rectangle.DEFAULT_SECOND_SIDE);
    }

    private RightTriangle getDefaultRightTriangle() {
        return new RightTriangle(Figure.DEFAULT_COLOR,
                RightTriangle.DEFAULT_LEFT_LEG,
                RightTriangle.DEFAULT_RIGHT_LEG);
    }

    private Square getDefaultSquare() {
        return new Square(Figure.DEFAULT_COLOR, Square.DEFAULT_SIDE);
    }
}

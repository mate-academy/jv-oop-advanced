package core.basesyntax.service;

import core.basesyntax.entity.*;

import java.util.Random;

public class FigureSupplier {
    private final static int NUMBER_OF_FIGURES = 5;

    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        return switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0 -> getRandomCircle();
            case 1 -> getRandomIsoscelesTrapezoid();
            case 2 -> getRandomRectangle();
            case 3 -> getRandomRightTriangle();
            case 4 -> getRandomSquare();
            default -> throw new IllegalStateException("Unexpected value: " + random.nextInt(5));
        };
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(Circle.MAX_RADIUS));
    }
    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextDouble(IsoscelesTrapezoid.MAX_HIGH),
                random.nextDouble(IsoscelesTrapezoid.MAX_UPPER_BASE),
                random.nextDouble(IsoscelesTrapezoid.MAX_LOWER_BASE));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextDouble(Rectangle.MAX_FIRST_SIDE),
                random.nextDouble(Rectangle.MAX_SECOND_SIDE));
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextDouble(RightTriangle.MAX_LEFT_LEG),
                random.nextDouble(RightTriangle.MAX_RIGHT_LEG));
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextDouble(Square.MAX_SIDE));
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

    public Figure getDefaultFigure() {
        return switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0 -> getDefaultCircle();
            case 1 -> getDefaultIsoscelesTrapezoid();
            case 2 -> getDefaultRectangle();
            case 3 -> getDefaultRightTriangle();
            case 4 -> getDefaultSquare();
            default -> throw new IllegalStateException("Unexpected value: " + random.nextInt(5));
        };
    }
}

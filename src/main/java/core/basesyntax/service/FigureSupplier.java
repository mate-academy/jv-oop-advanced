package core.basesyntax.service;

import core.basesyntax.entity.*;

import java.util.Random;

public class FigureSupplier {
    private final static int NUMBER_OF_FIGURES = 5;
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        return switch (random.nextInt(5)) {
            case 0 -> new Circle(colorSupplier.getRandomColor(),
                    random.nextInt(Circle.MAX_RADIUS));
            case 1 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextDouble(IsoscelesTrapezoid.MAX_HIGH),
                    random.nextDouble(IsoscelesTrapezoid.MAX_UPPER_BASE),
                    random.nextDouble(IsoscelesTrapezoid.MAX_LOWER_BASE));
            case 2 -> new Rectangle(colorSupplier.getRandomColor(),
                    random.nextDouble(Rectangle.MAX_FIRST_SIDE),
                    random.nextDouble(Rectangle.MAX_SECOND_SIDE));
            case 3 -> new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextDouble(RightTriangle.MAX_LEFT_LEG),
                    random.nextDouble(RightTriangle.MAX_RIGHT_LEG));
            case 4 -> new Square(colorSupplier.getRandomColor(),
                    random.nextDouble(Square.MAX_SIDE));
            default -> throw new IllegalStateException("Unexpected value: " + random.nextInt(5));
        };
    }
}

package core.basesyntax.utils;

import core.basesyntax.abstraction.Figure;
import core.basesyntax.figures.*;

import java.util.Random;

public enum Figures {
    SQUARE,
    RECTANGLE,
    RIGHT_TRIANGLE,
    CIRCLE,
    ISOSCELES_TRAPEZOID;

    private static final int MAX_VALUE = 100;

    public Figure getFigure(Random random, ColorSupplier colorSupplier) {
        String color = colorSupplier.getRandomColor();

        switch (this) {
            case SQUARE:
                return new Square(color, random.nextInt(MAX_VALUE));
            case RECTANGLE:
                return new Rectangle(color, random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            case RIGHT_TRIANGLE:
                return new RightTriangle(color, random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            case CIRCLE:
                return new Circle(color, random.nextInt(MAX_VALUE));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(color, random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
        }
        return null;
    }
}

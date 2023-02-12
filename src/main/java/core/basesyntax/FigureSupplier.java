package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.NameOfFigure;
import java.util.Random;

public class FigureSupplier {
    private static final int RANGE_OF_RANDOM = 100;
    private static final int CIRCLE_RADIUS = 10;
    private final Figure defaultCircle = new Circle(Color.WHITE.toString(), CIRCLE_RADIUS);
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (getRandomNameOfFigure()) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), getRandomNumber());
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), getRandomNumber());
            case TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomNumber(),
                        getRandomNumber(), getRandomNumber());
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomNumber(),
                        getRandomNumber());
            case TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomNumber(),
                        getRandomNumber(), getRandomNumber());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return defaultCircle;
    }

    private NameOfFigure getRandomNameOfFigure() {
        return NameOfFigure.values()[random.nextInt(NameOfFigure.values().length)];
    }

    private double getRandomNumber() {
        return random.nextInt(RANGE_OF_RANDOM);
    }

}

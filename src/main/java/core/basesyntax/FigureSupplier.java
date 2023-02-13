package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.NameOfFigure;
import java.util.Random;

public class FigureSupplier {
    private static final int RANGE_OF_RANDOM = 100;
    private static final int CIRCLE_RADIUS = 10;
    private static final String COLOR_WHITE = Color.WHITE.name();
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
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomNumber(),
                        getRandomNumber(), getRandomNumber());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR_WHITE, CIRCLE_RADIUS);
    }

    private NameOfFigure getRandomNameOfFigure() {
        int randomNumber = random.nextInt(NameOfFigure.values().length);
        return NameOfFigure.values()[randomNumber];
    }

    private double getRandomNumber() {
        return random.nextInt(RANGE_OF_RANDOM);
    }

}

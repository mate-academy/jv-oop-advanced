package core.basesyntax.utils;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;

    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random) {
        this.random = random;
        this.colorSupplier = new ColorSupplier(random);
    }

    public Figure getRandomFigure() {
        int randomInt = random.nextInt(Figures.values().length);
        Figures figure = Figures.values()[randomInt];
        return getFigure(figure);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), 10);
    }

    public Figure getFigure(Figures figure) {
        String color = colorSupplier.getRandomColor();

        switch (figure) {
            case SQUARE:
                return new Square(color, getRandomNumber());
            case RECTANGLE:
                return new Rectangle(color, getRandomNumber(),
                        getRandomNumber());
            case RIGHT_TRIANGLE:
                return new RightTriangle(color, getRandomNumber(),
                        getRandomNumber());
            case CIRCLE:
                return new Circle(color, getRandomNumber());
            default:
                return new IsoscelesTrapezoid(color, getRandomNumber(),
                        getRandomNumber(), getRandomNumber());
        }
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_VALUE);
    }
}

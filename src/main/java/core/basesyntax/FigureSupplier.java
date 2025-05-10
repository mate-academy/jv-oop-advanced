package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MIN_RANDOM_PARAMETER = 1;
    private static final int MAX_RANDOM_PARAMETER = 11;
    private static final String COLOR_OF_DEFAULT_FIGURE = Color.WHITE.toString().toLowerCase();
    private static final int SIZE_PARAMETER_OF_DEFAULT_FIGURE = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public core.basesyntax.Figure getRandomFigure() {
        Figure randomType = getRandomFigureType();
        String randomColor = colorSupplier.getRandomColor();

        switch (randomType) {
            case SQUARE:
                return new Square(randomColor, getRandomParameter());
            case RECTANGLE:
                return new Rectangle(randomColor, getRandomParameter(), getRandomParameter());
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomColor, getRandomParameter(), getRandomParameter());
            case CIRCLE:
                return new Circle(randomColor, getRandomParameter());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(randomColor, getRandomParameter(),
                        getRandomParameter(), getRandomParameter());
            default:
                throw new IllegalArgumentException("This figure doesn't exist");
        }
    }

    public core.basesyntax.Figure getDefaultFigure() {
        return new Circle(COLOR_OF_DEFAULT_FIGURE, SIZE_PARAMETER_OF_DEFAULT_FIGURE);
    }

    private Figure getRandomFigureType() {
        int index = random.nextInt(Figure.values().length);
        return Figure.values()[index];
    }

    private double getRandomParameter() {
        return random.nextInt(MIN_RANDOM_PARAMETER, MAX_RANDOM_PARAMETER);
    }
}

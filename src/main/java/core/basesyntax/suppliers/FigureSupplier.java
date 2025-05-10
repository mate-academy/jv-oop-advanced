package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Shape;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    /** Checkstyle plugin throws an error on the constant name with more than two capital
     *  letters in the row. So I had to use camelCase for the constants */
    static final int NUMBER_LIMIT = 45;
    static final int NUMBER_OF_FIGURES = 5;
    static final int ZERO_EXCLUSIVE = 1;
    static final int TRAPEZOID_COEFFICIENT = 2;
    static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Shape getRandomFigure() {
        int randomValue = random.nextInt(NUMBER_OF_FIGURES) + ZERO_EXCLUSIVE;
        return switch (randomValue) {
            case 1 -> new Circle(getRandomColor(), getRandomSide());
            case 2 -> new IsoscelesTrapezoid(getRandomColor(), getRandomSide(),
                    getRandomSide() * TRAPEZOID_COEFFICIENT, getRandomSide());
            case 3 -> new Rectangle(getRandomColor(), getRandomSide(), getRandomSide());
            case 4 -> new RightTriangle(getRandomColor(), getRandomSide(), getRandomSide());
            case 5 -> new Square(getRandomColor(), getRandomSide());
            default -> throw new IllegalStateException("Unexpected value: " + randomValue);
        };
    }

    public int getRandomSide() {
        return random.nextInt(NUMBER_LIMIT);
    }

    public String getRandomColor() {
        return colorSupplier.getRandomColor();
    }

    public Shape getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
